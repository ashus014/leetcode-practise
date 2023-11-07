package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.*;

class Rat_In_a_maze {

    public static void main(String[] args) {

        int n = 4;
        int[][] a = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        ArrayList<String> res = findPath(a, n);
        if (!res.isEmpty()) {
            System.out.println(res);
        } else {
            System.out.println(-1);
        }
    }

    private static void solve(int i, int j, int[][] maze, int n, ArrayList<String> res, String ds,
                              int[][] visited) {
        if (i == n - 1 && j == n - 1) {
            res.add(ds);
            return;
        }

        // downward
        if (i + 1 < n && visited[i + 1][j] == 0 && maze[i + 1][j] == 1) {
            visited[i][j] = 1;
            solve(i + 1, j, maze, n, res, ds + 'D', visited);
            visited[i][j] = 0;
        }

        // left
        if (j - 1 >= 0 && visited[i][j - 1] == 0 && maze[i][j - 1] == 1) {
            visited[i][j] = 1;
            solve(i, j - 1, maze, n, res, ds + 'L', visited);
            visited[i][j] = 0;
        }

        // right
        if (j + 1 < n && visited[i][j + 1] == 0 && maze[i][j + 1] == 1) {
            visited[i][j] = 1;
            solve(i, j + 1, maze, n, res, ds + 'R', visited);
            visited[i][j] = 0;
        }

        // upward
        if (i - 1 >= 0 && visited[i - 1][j] == 0 && maze[i - 1][j] == 1) {
            visited[i][j] = 1;
            solve(i - 1, j, maze, n, res, ds + 'U', visited);
            visited[i][j] = 0;
        }
    }

    public static ArrayList<String> findPath(int[][] maze, int n) {

        int[][] visited = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = 0;
            }
        }

        ArrayList<String> res = new ArrayList<>();
        if (maze[0][0] == 1)
            solve(0, 0, maze, n, res, "", visited);
        return res;
    }
}