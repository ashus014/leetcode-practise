package src.DSASheetForDataStructures.Arrays;

// https://practice.geeksforgeeks.org/problems/find-minimum-and-maximum-element-in-an-array4428/1
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 

public class Question2 {
    
    public static void main(String[] args) {
        
    }

    static pair getMinMax(long a[], long n)  
    {
        Long MIN_ELEMENT = Long.MAX_VALUE;
        Long MAX_ELEMENT = Long.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(a[i] > MAX_ELEMENT) {
                MAX_ELEMENT = a[i];
            }
            if(a[i] < MIN_ELEMENT) {
                MIN_ELEMENT = a[i];
            }
        }

        return new pair(MIN_ELEMENT, MAX_ELEMENT);
    }
}
