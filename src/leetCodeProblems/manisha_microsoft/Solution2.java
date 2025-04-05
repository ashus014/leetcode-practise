package src.leetCodeProblems.manisha_microsoft;

import java.util.*;

class Solution2 {
    private int maxChambers;
    private int N;
    private int M;
    private boolean[][] visited;
    private boolean foundPath;

    public int solution(String[] B) {
        N = B.length;
        M = B[0].length();
        visited = new boolean[N][M];
        maxChambers = -1;  // Reset for each new test case
        foundPath = false;  // Track if we can reach the end

        // Check if start and end are safe
        if (B[0].charAt(0) == 'X' || B[N-1].charAt(M-1) == 'X') {
            return -1;
        }

        // Start DFS from the top-left corner
        visited[0][0] = true;
        dfs(0, 0, 1, B);

        // If no path was found to the end, return -1
        return foundPath ? maxChambers : -1;
    }

    private void dfs(int r, int c, int chambers, String[] B) {
        // If we reached the target
        if (r == N-1 && c == M-1) {
            foundPath = true;
            maxChambers = Math.max(maxChambers, chambers);
            return;
        }

        // Try all possible moves: right, left, down
        int[][] moves = {{0, 1}, {0, -1}, {1, 0}};

        for (int[] move : moves) {
            int newR = r + move[0];
            int newC = c + move[1];

            // Check if move is valid
            if (isValid(newR, newC, B) && !visited[newR][newC]) {
                visited[newR][newC] = true;
                dfs(newR, newC, chambers + 1, B);
                visited[newR][newC] = false;  // backtrack
            }
        }
    }

    private boolean isValid(int r, int c, String[] B) {
        return r >= 0 && r < N && c >= 0 && c < M && B[r].charAt(c) == '.';
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();

        // Test Case 1
        String[] B1 = {
                "..X.",
                "...X",
                "....",
                "X..."
        };
        System.out.println("Test Case 1 Expected: 9, Got: " + solution.solution(B1));

        // Test Case 2
        String[] B2 = {
                ".X...",
                ".X...",
                "...X."
        };
        System.out.println("Test Case 2 Expected: -1, Got: " + solution.solution(B2));

        // Test Case 3
        String[] B3 = {
                "......",
                ".XXXX.",
                "...X..",
                "...X.X",
                "......"
        };
        System.out.println("Test Case 3 Expected: 14, Got: " + solution.solution(B3));

        // Test Case 4
        String[] B4 = {
                "....XXX",
                "XXX....",
                "XX.....",
                "...XXXX",
                "......."
        };
        System.out.println("Test Case 4 Expected: 23, Got: " + solution.solution(B4));


    }
}