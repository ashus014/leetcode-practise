package src.dataStructures.javaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArray {
    

    public static void main(String[] args) {
        

        List<int[]> ashu = new ArrayList<>();

        int []temp = {1,2,3,4};
        ashu.add(temp);


        for(int i=0 ; i<ashu.size(); i++) {
            System.out.println(Arrays.toString(ashu.get(i)));
        }
    }
}
