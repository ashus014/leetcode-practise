package src.DSASheetForDataStructures.Arrays;

import java.rmi.server.ObjID;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Question14 {
    
    // public static final int START = 0;
    // public static final int END = 1;
    public static void main(String[] args) {
        
        // int[][]arr = {{1,3},{2,4},{6,8},{9,10}};
        int[][]arr = {{1,3},{9,10},{6,8},{2,4}};
        System.out.println(Arrays.deepToString(overlappedInterval(arr)));
    }

    static public int[][] overlappedInterval(int[][] Intervals)
    {
        if(Intervals.length <= 0) {
            return new int[][]{};
        }
        final int START = 0;
        final int END = 1;

        Stack<int[]> stack = new Stack<>();
        Arrays.sort(Intervals, Comparator.comparing(x -> x[0]));
        // System.out.println(Arrays.deepToString(Intervals));

        stack.push(Intervals[0]);

        for(int i=1; i<Intervals.length; i++) {
            int [] top = stack.peek();

            if(top[END] < Intervals[i][START]) {
                stack.push(Intervals[i]);
            } else if(top[END] < Intervals[i][END]) {
                top[END] = Intervals[i][END];
                stack.pop();
                stack.push(top);
            }
        }
    //    System.out.println(stack.size());

       int[][] result = new int[stack.size()][];
       int i =0;
       while(!stack.isEmpty()) {
            int[]temp = stack.pop();
            result[i++] = temp;
       }

       Arrays.sort(result, Comparator.comparing(x -> x[0]));
        return result;
    }
}
