package src.DSASheetForDataStructures.Arrays;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/minimize-the-heights3351/1
public class Question9 {
    
    public static void main(String[] args) {
        
        int arr[] = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        // int arr[] = {1, 5, 8, 10};
        int n = arr.length;
        int k = 5;
        System.out.println(getMinDiff(arr, n, k));
    }

    static int getMinDiff(int[] arr, int n, int k) {
        // code here

        // System.out.println(Arrays.toString(arr));

        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // if(arr[0] - k <= 0) {
        //     arr[0] += k;
        // } else {
        //     arr[0] -= k;
        // }
        
        // arr[arr.length - 1] -= k;

        // System.out.println(Arrays.toString(arr));
        
        // return (arr[arr.length - 1] - arr[0] > 0) ? arr[arr.length - 1] - arr[0] : (arr[arr.length - 1] - arr[0])*-1;

        Arrays.sort(arr);
        int min = arr[0]+k;
        int max = arr[n-1]-k;
        int small;
        int ans = arr[n-1] - arr[0];
        for(int i=0;i<n-1;i++){
            small = Math.min(min,arr[i+1] - k);
            if(small < 0) continue;
            ans = Math.min(ans, Math.max(max, arr[i]+k)-small);
        }
        return ans;
    }
}
