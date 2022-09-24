package src.dataStructures.recursion;

import java.nio.file.Path;

import javax.swing.plaf.BorderUIResource.EtchedBorderUIResource;

public class MazeProblems {
    
    public static void main(String[] args) {
        // System.out.println(count(4, 4));
        // printPaths("", 3, 3);
        Boolean [][]board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        printPathsWithRiverWithBackTracking("", board, 0, 0);
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

    // maze with backtracking
    static void printPathsWithRiverWithBackTracking(String s, Boolean[][]maze,int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(s);
            return;
        }
        
        if(!maze[r][c]) {
            return;
        }

        //I am considering this block in my path
        maze[r][c] = false;

        if(r < maze.length - 1) {
            printPathsWithRiverWithBackTracking(s+'D', maze, r+1, c);
        }
        if(c < maze[0].length - 1) {
            printPathsWithRiverWithBackTracking(s+'R', maze, r, c+1);
        }
        if(r > 0) {
            printPathsWithRiverWithBackTracking(s+'U', maze, r-1, c);
        }
        if(c > 0) {
            printPathsWithRiverWithBackTracking(s+'L', maze, r, c-1);
        }
        //now the function is getting over
        //remove the changes that I have made
        maze[r][c] = true;
    }
}
