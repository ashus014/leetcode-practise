package src.DSASheetForDataStructures.SearhingAndSorting;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Question9 {
    public static void main(String[] args) {
     
        int arr[] = {1,2,2,6,5};
        System.out.println(findPair(arr, arr.length, 0));
    }

    static public boolean findPair(int arr[], int size, int n)
    {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int temp : arr) {
            hashMap.put(temp, hashMap.getOrDefault(temp, 0) + 1);
        }

        Set<Integer> keys = hashMap.keySet();

        for(int temp : keys) {
            if(keys.contains(temp + n)) {
                if(n == 0) {
                    if(hashMap.get(temp + n) > 1){
                        return true;
                    }
                    
                } else {
                    return true;
                }
            }
        }
        
        return false;
    }

    // static public boolean findPair2(int arr[], int size, int n)
    // {

    //     HashSet<Integer> hashSet = new HashSet<>();
    //     for(int temp : arr) {
    //         hashSet.add(temp);
    //     }
    
    //     for(int temp : hashSet) {
    //         int i = temp;
    //         hashSet.remove(i);
    //         if(hashSet.contains(temp + n)) {
    //             return true;
    //         }
    //         hashSet.add(i);
    //     }
        
    //     return false;
    // }

}
