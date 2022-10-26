package src.DSASheetForDataStructures.SearhingAndSorting;

public class Question11 {
    public static void main(String[] args) {
        
        int a[] = {5,5,10,100,10,5};
        System.out.println(FindMaxSum(a, a.length));
    }

    static public int FindMaxSum(int arr[], int n)
    {
        // Your code here
        int sum1 = arr[0];
        int sum2 = 0;
        int result;

        for (int i = 1; i < n; i++){
            result = (sum1 > sum2) ? sum1 : sum2;
            sum1 = sum2 + arr[i];
            sum2 = result;
        }
        return ((sum1 > sum2) ? sum1 : sum2);
    }
}
