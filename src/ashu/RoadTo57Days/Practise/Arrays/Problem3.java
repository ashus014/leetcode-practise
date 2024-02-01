package src.ashu.RoadTo57Days.Practise.Arrays;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Problem3 {


    public static void main(String[] args) {

        int[] arr = {4, 1, 1, 2, 2, 2, 3, 3};
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for(int e : arr)
            set.add(e);

        System.out.println(set);
    }
}
