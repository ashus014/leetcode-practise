package src.ashu.arrayOperations;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {

    public static void main(String[] args) {

//
//        Input: { a b { c d { e d } c } { m n } k b }
//
//        {
//            a, b
//            {
//                c, d
//                {
//                    e, d
//                }
//                c
//            }
//            {
//                m, n
//            }
//            k, b, c
//            {
//                x, y
//            }
//        }
//
//        Output:
//        -abkb*c
//                --cdc*
//                ---ed
//                        --mn
//                --xy
//
//
//                ---ed
//                --cdc*
//                --mn
//                        --xy
//                -abkb*c


        String str = "{ a b { c d { e d } c } { m n } k b }";
        printTheLevelHierarchy(str);


        // stack = FILO " {, {," -- NOT NEEDED
        // atWhichLevel <int>= 2
        // levelElements [] String= ["ab", "mn", ""]

        // Visit later
        //--// HashSet <Strings> = { "a", }
        // "{ a b { c d { e d } c } { m n } k b }";
    }

    private static void printTheLevelHierarchy(String str) {

        List<String> levelElements = new ArrayList<>();
        int atWhichLevel = 0;
        char[] charArray = str.toCharArray();

        for( int i =0 ; i < charArray.length; i++) {
            if(charArray[i] == '{') {
                atWhichLevel++;
            } else if(charArray[i] == '}') {
                atWhichLevel--;
                for(int j = 0; j<= atWhichLevel; j++) {
                    System.out.print("-");
                }
                System.out.println(levelElements.get(atWhichLevel));
                levelElements.add(atWhichLevel, "");

            } else {
                String temp = levelElements.get(atWhichLevel - 1);
                if(temp == null) {
                    temp = "";
                }
                if(temp.contains(String.valueOf(charArray[i]))) {
                    temp = temp + charArray[i] + "*";
                    levelElements.add(atWhichLevel - 1, temp);
                } else {
                    levelElements.add(atWhichLevel - 1, temp);
                }
            }
        }
    }

//    private static boolean isVariableDeclaredEarlier(String str, char c) {
//        if(str.contains(c))
//            return true;
//        return false;
//    }
}
