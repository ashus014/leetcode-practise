package src.interviews.walmart_senior_software.set_1;

import java.util.HashMap;
import java.util.Map;

public class Round2_Problem2 {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,3);
        map.put(3,3);
        map.put(4,3);

        map.forEach((k,v) -> System.out.println(k + " " + v));

        System.out.println("#################");

        for(Map.Entry<Integer, Integer> temp : map.entrySet()) {
            System.out.println(temp.getKey() + " " + temp.getValue());
        }

    }
}
