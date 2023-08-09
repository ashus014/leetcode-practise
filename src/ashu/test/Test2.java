package src.ashu.test;

public class Test2 {

    public static void main(String[] args) {

        int[] array = {-21, -2, 0, 1, 5, 7, 10, 23};
        int element = -21;
        //output: 5
        System.out.println(findIndex(array, element));

    }


    private static int findIndex(int[] arr, int key) {
        int start=0, end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end)/2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
