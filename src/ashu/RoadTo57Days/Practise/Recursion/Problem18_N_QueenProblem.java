package src.ashu.RoadTo57Days.Practise.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Problem18_N_QueenProblem {

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> board = new ArrayList<>();
        String s = ".".repeat(n);
        for(int i = 0; i < n ; i++) {
            board.add(s);
        }
        solve(0, board, ans, n);
        return ans;
    }

    private static void solve(int col, List<String> board, List<List<String>> ans, int n) {
        if(col == n) {
            ans.add(new ArrayList<>(board));
            return;
        }

        for(int row = 0; row < n; row++) {
            if(isSafe(row, col, board, n)) {
                StringBuilder rowString = new StringBuilder(board.get(row));
                rowString.setCharAt(col, 'Q');
                board.set(row, rowString.toString());

                solve(col + 1, board, ans, n);

                //backtrack
                rowString.setCharAt(col, '.');
                board.set(row, rowString.toString());
            }
        }
    }

    private static boolean isSafe(int row, int col, List<String> board, int n) {
        int dupRow = row;
        int dupCol = col;

        // Check upper diagonal
        while (row >= 0 && col >= 0) {
            if (board.get(row).charAt(col) == 'Q')
                return false;
            row--;
            col--;
        }

        col = dupCol;
        row = dupRow;
        // Check left
        while (col >= 0) {
            if (board.get(row).charAt(col) == 'Q')
                return false;
            col--;
        }

        col = dupCol;
        row = dupRow;
        // Check lower diagonal
        while (row < n && col >= 0) {
            if (board.get(row).charAt(col) == 'Q')
                return false;
            row++;
            col--;
        }

        return true;
    }
}
