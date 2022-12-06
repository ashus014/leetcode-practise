package src.DSASheetForDataStructures.Greedy;

import java.util.Arrays;

public class Question1 {

    public static void main(String[] args) {

        int[] start = { 75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924 };
        int[] end = { 112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 };
        System.out.println(maxMeetings(start, end, Math.max(start.length, end.length)));
    }

    public static int maxMeetings(int start[], int end[], int n) {

        int result = 1;
        int prev = 0;

        // Let's sort from initial time

        // This is taking time O(n*log(n))
        quicksort(end, start, 0, n - 1);

        System.out.println(Arrays.toString(start));
        System.out.println(Arrays.toString(end));

        for (int curr = 1; curr < start.length; curr++) {
            if (start[curr] >= end[prev]) {
                result++;
                prev = curr;
            }
        }

        return result;
    }

    static void quicksort(int[] last, int[] first, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = last[mid];

        while (start <= end) {
            while (last[start] < pivot) {
                start++;
            }
            while (last[end] > pivot) {
                end--;
            }

            if (start <= end) {
                int temp = last[start];
                last[start] = last[end];
                last[end] = temp;

                temp = first[start];
                first[start] = first[end];
                first[end] = temp;

                start++;
                end--;
            }
        }
        quicksort(last, first, low, end);
        quicksort(last, first, start, high);
    }
}
