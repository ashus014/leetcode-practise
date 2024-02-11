package src.interviews.ibm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Map<String, String>> listOfMaps = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("Hello1", "Value1");
        map1.put("Hello2", "Value2");
        map1.put("Hello3", "Value3");
        listOfMaps.add(map1);

        Map<String, String> map2 = new HashMap<>();
        map2.put("Hello4", "Value1");
        map2.put("Hello5", "Value2");
        listOfMaps.add(map2);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello1");
        stringList.add("Hello2");

        Map<String, String> result = listOfMaps.stream()
                .flatMap(map -> map.entrySet().stream())
                .filter(entry -> stringList.contains(entry.getKey()))
                .collect(HashMap::new, (m, e) -> m.put(e.getKey(), e.getValue()), HashMap::putAll);

        System.out.println(result);
    }
}
