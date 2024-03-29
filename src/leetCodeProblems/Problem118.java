package src.leetCodeProblems;

import java.util.ArrayList;
import java.util.List;

public class Problem118 {

    public static void main(String[] args) {

        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = null;
        List<Integer> pre = null;

        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    row.add(1);
                 else
                    row.add(pre.get(j - 1) + pre.get(j));
            }
            pre = row;
            result.add(row);
        }
        return result;
    }
}
