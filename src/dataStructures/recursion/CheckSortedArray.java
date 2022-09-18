package src.dataStructures.recursion;

public class CheckSortedArray {
    

    public static void main(String[] args) {
        
        int[] arr = {1,7,2,3,4,5,6};
        System.out.println(checkSorted(arr));
    }

    public static boolean checkSorted(int[] arr) {

        return helperFunction(arr, 0);
    }

    private static boolean helperFunction(int[] arr, int i) {
        
        if(i == arr.length - 1) {
            return true;
        }

        return arr[i] < arr[i+1] && helperFunction(arr, i+1);
    }
}
