package src.leetCodeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem2246 {

    private static int longestPath = 1;

    public static void main(String[] args) {
        int[] parent = { -1, 0, 0, 1, 1, 2 };
        String s = "abacbe";
        System.out.println(longestPath(parent, s));
    }

    public static int longestPath(int[] parent, String s) {

        int n = parent.length;
        Map<Integer, List<Integer>> children = new HashMap<>();
        for (int i = 1; i < n; i++) {
            children.computeIfAbsent(parent[i], value -> new ArrayList<Integer>()).add(i);
        }

        System.out.println(children);

        dfs(0, children, s);
        return longestPath;
    }

    private static int dfs(int currentNode, Map<Integer, List<Integer>> children, String s) {

        if (!children.containsKey(currentNode))
            return 1;

        int longestChain = 0;
        int secondLongestChain = 0;

        for (int child : children.get(currentNode)) {
            int longestChainStartingFromChild = dfs(child, children, s);

            if (s.charAt(currentNode) == s.charAt(child))
                continue;

            if (longestChainStartingFromChild > longestChain) {
                secondLongestChain = longestChain;
                longestChain = longestChainStartingFromChild;
            } else if (longestChainStartingFromChild > secondLongestChain) {
                secondLongestChain = longestChainStartingFromChild;
            }
        }

        longestPath = Math.max(longestPath, longestChain + secondLongestChain + 1);
        return longestChain + 1;
    }

}
