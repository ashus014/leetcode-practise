package src.ashu.test2;

import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0};
        System.out.println(getPosistion(arr, 4));
    }

    private static List<Integer> getPosistion(int[] arr, int keySize) {

        int convertedNumericalValue = convertToDecimal(arr, arr.length - keySize, arr.length);
        //convertedNumericalValue = 3

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int tmp = convertToDecimal(arr, i, i + keySize);

            // Update the list
            if(map.get(tmp).size() > 0) {
                List<Integer> values = map.get(tmp);
                values.add(i);
                map.put(tmp, values);
            } else {
                map.put(tmp, List.of(i));
            }
        }

        return map.get(convertedNumericalValue);
    }




    public static Integer convertToDecimal(int[] arr, int start, int end) {
        return 0;
    }
}
