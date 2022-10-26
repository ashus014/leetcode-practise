package src.DSASheetForDataStructures.SearhingAndSorting;

public class Question11 {
    public static void main(String[] args) {
        
        int a[] = {1,2,3,1,5};
        System.out.println(FindMaxSum(a, a.length));
    }

    static public int FindMaxSum(int arr[], int nlen)
    {
        // Your code here
        int rob1=0, rob2=0;
         for(int n : arr) {
             int temp = Math.max(n+rob1, rob2);
             rob1 = rob2;
             rob2 = temp;
         }
         return rob2;
    }
}
