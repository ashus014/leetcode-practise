package src.ashu.arrayOperations;

public class Problem16 {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 6, 3, 2, 4, 2};
        System.out.println(maxArea(arr));
    }

    private static int maxArea(int[] arr) {
        int area = 0;
        int maxAreaFoundSoFar = 0;

        for (int i = 0; i < arr.length; i++) {
            int left = i - 1;
            int right = i + 1;

            while (left >= 0 && arr[left] >= arr[i]) {
                left--;
            }

            while (right < arr.length && arr[right] >= arr[i]) {
                right++;
            }

            area = (right - left - 1) * arr[i];
            maxAreaFoundSoFar = Math.max(area, maxAreaFoundSoFar);
        }

        return maxAreaFoundSoFar;
    }
}
