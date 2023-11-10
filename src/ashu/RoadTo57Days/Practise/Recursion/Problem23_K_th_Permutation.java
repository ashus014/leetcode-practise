package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Problem23_K_th_Permutation {

    public static void main(String[] args) {
        System.out.println(getPermutation(4, 17));
    }

    public static String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans = "";
        k = k - 1;
        while (true) {
            ans += numbers.get(k / fact);
            numbers.remove(k / fact);
            if(numbers.isEmpty()) {
                break;
            }
            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }
}
