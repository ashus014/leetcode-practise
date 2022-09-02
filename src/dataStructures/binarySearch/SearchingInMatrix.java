package src.dataStructures.binarySearch;

import java.util.Arrays;

public class SearchingInMatrix {
    
    public static void main(String[] args) {
        
        int[][] ashu = {
            {18, 9, 12},
            {36, -4, 91},
            {44, 33, 16}
        };

        int targrt = 33;
        for(int i=0; i<3; i++) {
            for(int j=0; j<ashu[i].length; j++) {
                if(ashu[i][j] == targrt) {
                    System.out.println("Found it!!");
                }
            }
        } 

        // System.out.println(Arrays.(ashu));
    }
}
