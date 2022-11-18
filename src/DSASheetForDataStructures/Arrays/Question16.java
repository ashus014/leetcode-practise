package src.DSASheetForDataStructures.Arrays;

public class Question16 {

    public static void main(String[] args) {

        long[] arr = { 10, 10, 10 };
        System.out.println(inversionCount(arr, arr.length));
    }

    static long inversionCount(long arr[], long N) {

        int result = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (arr[j] < arr[i])
                    result++;
            }
        }
        return result;
    }
}
