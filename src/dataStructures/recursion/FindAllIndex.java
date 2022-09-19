package src.dataStructures.recursion;

import java.util.ArrayList;
class FindAllIndex {
    

    public static void main(String[] args) {
        
        int[] arr = {1,2,6,3,4,7,4,8,9};
        ArrayList<Integer> answer = new ArrayList<>();
        answer = findAllIndex(arr, 4, 0, answer);
        System.out.println(answer);
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> answer) {
        
        if(index == arr.length) {
            return answer;
        }

        if(arr[index] == target) {
            answer.add(index);
        }

        return findAllIndex(arr, target, index+1, answer);
    }

}