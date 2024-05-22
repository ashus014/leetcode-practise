package src.ashu.temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExpressionEvaluator {

    public static void main(String[] args) {
        String api = "[{\"groupName\":\"Group1\",\"expressions\":[{\"name\":\"a\",\"expressionType\":\"DIRECT\",\"expression\":\"10\",\"dependencies\":[]},{\"name\":\"b\",\"expressionType\":\"RS_EXPRESSION\",\"expression\":\"${a} + 10\",\"dependencies\":[\"a\"]},{\"name\":\"c\",\"expressionType\":\"DOLLAR_EXPRESSION\",\"expression\":\"${a} + 10\",\"dependencies\":[\"a\"]}]},{\"groupName\":\"Group2\",\"expressions\":[{\"name\":\"a\",\"expressionType\":\"DIRECT\",\"expression\":\"20\",\"dependencies\":[]},{\"name\":\"b\",\"expressionType\":\"RS_EXPRESSION\",\"expression\":\"${a} + 10\",\"dependencies\":[\"a\"]}]},{\"groupName\":\"Group3\",\"expressions\":[]}]";
        List<String> results = evaluate(api);
        results.forEach(System.out::println);
    }

    public static List<String> evaluate(String api) {
        List<String> results = new ArrayList<>();
        try {
            // Parse JSON data
            List<Map<String, Object>> groups = parseJsonData(api);

            // Evaluate expressions for each group
            for (Map<String, Object> group : groups) {
                String groupName = (String) group.get("groupName");
                List<Map<String, Object>> expressions = (List<Map<String, Object>>) group.get("expressions");
                Map<String, String> evaluatedExpressions = evaluateGroupExpressions(expressions);
                StringBuilder result = new StringBuilder(groupName).append(":");
                for (Map.Entry<String, String> entry : evaluatedExpressions.entrySet()) {
                    result.append(entry.getKey()).append(":").append(entry.getValue()).append(":");
                }
                if (result.length() > 0 && result.charAt(result.length() - 1) == ':') {
                    result.setLength(result.length() - 1); // Remove trailing colon
                }
                results.add(result.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }

    private static List<Map<String, Object>> parseJsonData(String jsonResponse) throws Exception {
        List<Map<String, Object>> groups = new ArrayList<>();
        jsonResponse = jsonResponse.substring(1, jsonResponse.length() - 1); // Remove square brackets
        String[] jsonGroups = jsonResponse.split("\\},\\{");
        for (String jsonGroup : jsonGroups) {
            Map<String, Object> group = new HashMap<>();
            String[] groupParts = jsonGroup.split("\",\"expressions\":\\[");
            group.put("groupName", groupParts[0].split("\"groupName\":\"")[1]);

            List<Map<String, Object>> expressions = new ArrayList<>();
            if (groupParts.length > 1 && !groupParts[1].isEmpty()) {
                String[] jsonExpressions = groupParts[1].split("\\},\\{");
                for (String jsonExpression : jsonExpressions) {
                    Map<String, Object> expression = new HashMap<>();
                    String[] exprParts = jsonExpression.split(",\"");
                    for (int i = 0; i < exprParts.length; i++) {
                        String part = exprParts[i];
                        if (i == 0) {
                            part = part.substring(1); // Remove the leading '{'
                        } else {
                            part = "\"" + part; // Add the leading '"'
                        }
                        if (i == exprParts.length - 1) {
                            part = part.substring(0, part.length() - 1); // Remove the trailing '}'
                        } else {
                            part = part + "\""; // Add the trailing '"'
                        }
                        String[] keyValue = part.split("\":\"");
                        expression.put(keyValue[0].replaceAll("\"", ""), keyValue[1].replaceAll("\"", ""));
                    }
                    String[] dependencies = expression.get("dependencies").toString().replace("[", "").replace("]", "").split(",");
                    List<String> depList = new ArrayList<>();
                    for (String dep : dependencies) {
                        if (!dep.isEmpty()) {
                            depList.add(dep.trim());
                        }
                    }
                    expression.put("dependencies", depList);
                    expressions.add(expression);
                }
            }
            group.put("expressions", expressions);
            groups.add(group);
        }
        return groups;
    }



    private static Map<String, String> evaluateGroupExpressions(List<Map<String, Object>> expressions) {
        Map<String, String> evaluatedExpressions = new HashMap<>();
        List<String> pendingExpressions = new ArrayList<>();

        // First pass to evaluate DIRECT expressions
        for (Map<String, Object> expr : expressions) {
            String name = (String) expr.get("name");
            String expressionType = (String) expr.get("expressionType");
            String expression = (String) expr.get("expression");

            if (expressionType.equals("DIRECT")) {
                evaluatedExpressions.put(name, expression);
            } else {
                pendingExpressions.add(name);
            }
        }

        boolean progress;
        do {
            progress = false;
            List<String> newlyEvaluated = new ArrayList<>();
            for (Map<String, Object> expr : expressions) {
                String name = (String) expr.get("name");
                if (!evaluatedExpressions.containsKey(name) && pendingExpressions.contains(name)) {
                    List<String> dependencies = (List<String>) expr.get("dependencies");
                    boolean allDependenciesResolved = true;
                    for (String dependency : dependencies) {
                        if (!evaluatedExpressions.containsKey(dependency)) {
                            allDependenciesResolved = false;
                            break;
                        }
                    }
                    if (allDependenciesResolved) {
                        String expressionType = (String) expr.get("expressionType");
                        String expression = (String) expr.get("expression");
                        String evaluatedExpr = evaluateExpression(expressionType, expression, evaluatedExpressions);
                        evaluatedExpressions.put(name, evaluatedExpr);
                        newlyEvaluated.add(name);
                        progress = true;
                    }
                }
            }
            pendingExpressions.removeAll(newlyEvaluated);
        } while (progress);

        // Handle any expressions that couldn't be evaluated due to missing dependencies
        for (String name : pendingExpressions) {
            evaluatedExpressions.put(name, "UNRESOLVED_DEPENDENCY");
        }

        return evaluatedExpressions;
    }

    private static String evaluateExpression(String expressionType, String expression, Map<String, String> evaluatedExpressions) {
        String result;
        switch (expressionType) {
            case "DOLLAR_EXPRESSION":
                result = evaluateDollarExpression(expression, evaluatedExpressions);
                break;
            case "RS_EXPRESSION":
                result = evaluateRSExpression(expression, evaluatedExpressions);
                break;
            default:
                throw new UnsupportedOperationException("Unsupported expression type: " + expressionType);
        }
        return result;
    }

    private static String evaluateDollarExpression(String expression, Map<String, String> evaluatedExpressions) {
        String resolvedExpression = resolveDependencies(expression, evaluatedExpressions);
        return "(" + resolvedExpression + ") $";
    }

    private static String evaluateRSExpression(String expression, Map<String, String> evaluatedExpressions) {
        String resolvedExpression = resolveDependencies(expression, evaluatedExpressions);
        return "(" + resolvedExpression + ") RS";
    }

    private static String resolveDependencies(String expression, Map<String, String> evaluatedExpressions) {
        for (Map.Entry<String, String> entry : evaluatedExpressions.entrySet()) {
            expression = expression.replace("${" + entry.getKey() + "}", entry.getValue());
        }
        return expression;
    }
}
