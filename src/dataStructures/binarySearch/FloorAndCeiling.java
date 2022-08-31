package src.dataStructures.binarySearch;

public class FloorAndCeiling {

    public static void main(String[] args) {

        int [] arr = {-1,-2,4,6,8,14,44,67,88,91,167,631, 999};
        int target = 632;
        System.out.println(floorOfNumberRange(arr, target));

    }

    private static int floorOfNumberRange(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if(arr[mid] == target) {
                return arr[mid];
            } else if(arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // For floor
        // return arr[end];
        // For ceiling
        return arr[start];
    }


}
