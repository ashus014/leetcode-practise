package src.ashu.RoadTo57Days.Practise.Arrays;

public class Problem01_SecondLargest {

    public static void main(String[] args) {
        System.out.println(secondLargest(new int [] {5,44,6,3,7,8,1,9,77}));
    }

    private static int secondLargest(int[] arr) {

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
