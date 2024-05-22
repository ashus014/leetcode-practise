package src.ashu.leetcode;

import java.util.ArrayDeque;

public class NearestSmallerElement {

    public static void main(String[] args) {
        int[] arr = {4, 10, 5, 8, 20, 15, 3, 12};
        printNearestSmallestElement(arr);
    }

    private static void printNearestSmallestElement(int[] arr) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(stack.peek() + " ");
            }
            stack.push(arr[i]);
        }
    }
}
