package src.DSASheetForDataStructures.SearhingAndSorting;


// https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
public class Question7 {
 
    
    public static void main(String[] args) {
        
        int A[] = {3,1,3,2,3,2};
        System.out.println(majorityElement(A, A.length));
    }

    static int majorityElement(int a[], int size)
    {
        // your code here
        int maxNumber = findMaxOccurence(a);
        if(ifMajorityOccurence(a,maxNumber))
            return maxNumber;

        return -1;
    }

    private static boolean ifMajorityOccurence(int[] a, int maxNumber) {

        int count = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] == maxNumber)
                count++;
        }

        if(count > a.length/2)
            return true;

        return false;
    }

    private static int findMaxOccurence(int[] a) {
        
        int maxOccurenceIndex = 0;
        int count = 1;

        for(int i=1; i<a.length; i++) {

            if(a[maxOccurenceIndex] == a[i]) {
                count++;
            } else {
                count--;
            }

            if(count == 0) {
                maxOccurenceIndex = i;
                count = 1;
            }
        }
        System.out.println("ashu" + a[maxOccurenceIndex]);
        return a[maxOccurenceIndex];
    }
}
