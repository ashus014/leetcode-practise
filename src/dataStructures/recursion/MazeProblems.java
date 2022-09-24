package src.dataStructures.recursion;

import java.nio.file.Path;

import javax.swing.plaf.BorderUIResource.EtchedBorderUIResource;

public class MazeProblems {
    
    public static void main(String[] args) {
        // System.out.println(count(4, 4));
        printPaths("", 3, 3);

    }

    // going from (0,0) to (2,2) : Possible ways to reach
    static int count(int r, int c) {
        if(r == 1 || c == 1) {
            return 1;
        }
        int left = count(r-1, c);
        int right = count(r, c-1);
        return left + right;
    }

    //print all the possible paths
    static void printPaths(String s, int r, int c) {
        if(r == 1 && c == 1) {
            System.out.println(s);
            return;
        }
        if(r > 1) {
            printPaths(s+'D', r-1, c);
        }
        if(c > 1) {
            printPaths(s+'R', r, c-1);
        }
    }
}
