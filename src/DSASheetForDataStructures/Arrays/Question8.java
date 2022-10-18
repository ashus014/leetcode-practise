package src.DSASheetForDataStructures.Arrays;

public class Question8 {
    public static void main(String[] args) {
        int []arr = {-2 ,1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubarraySum(arr, 9));
    }

    static private long maxSubarraySum(int a[], int n){
        long result = Long.MIN_VALUE, sum=0;

        for(int i=0; i<n; i++) {
            sum = 0;
            for(int j=i; j<n; j++) {
                sum += a[j];

                if(sum > result) {
                    result = sum;
                }
            }
        }

        return result;
    }
}
