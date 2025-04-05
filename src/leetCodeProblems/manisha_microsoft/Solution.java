package src.leetCodeProblems.manisha_microsoft;

class Solution {
    public int solution(int[] A) {
        if (A.length < 2) return 0;

        // Try all possible first moves and track maximum moves possible
        int maxMoves = 0;

        // Try deleting first two elements
        if (A.length >= 2) {
            int sum = A[0] + A[1];
            maxMoves = Math.max(maxMoves, countMoves(A, sum, 2, A.length));
        }

        // Try deleting last two elements
        if (A.length >= 2) {
            int sum = A[A.length-1] + A[A.length-2];
            maxMoves = Math.max(maxMoves, countMoves(A, sum, 0, A.length-2));
        }

        // Try deleting first and last elements
        if (A.length >= 2) {
            int sum = A[0] + A[A.length-1];
            maxMoves = Math.max(maxMoves, countMovesFirstLast(A, sum, 1, A.length-1));
        }

        return maxMoves;
    }

    // Helper function to count moves possible with a given sum
    private int countMoves(int[] A, int targetSum, int start, int end) {
        if (end - start < 2) return 1;  // Base case - can't make more moves

        int moves = 1;  // Count the current move
        int maxAdditionalMoves = 0;

        // Try all three types of moves for the remaining array
        // 1. First two elements
        if (end - start >= 2 && A[start] + A[start+1] == targetSum) {
            maxAdditionalMoves = Math.max(maxAdditionalMoves,
                    countMoves(A, targetSum, start+2, end));
        }

        // 2. Last two elements
        if (end - start >= 2 && A[end-1] + A[end-2] == targetSum) {
            maxAdditionalMoves = Math.max(maxAdditionalMoves,
                    countMoves(A, targetSum, start, end-2));
        }

        // 3. First and last elements
        if (end - start >= 2 && A[start] + A[end-1] == targetSum) {
            maxAdditionalMoves = Math.max(maxAdditionalMoves,
                    countMovesFirstLast(A, targetSum, start+1, end-1));
        }

        return moves + maxAdditionalMoves;
    }

    // Similar helper for when we delete first and last elements
    private int countMovesFirstLast(int[] A, int targetSum, int start, int end) {
        if (end - start < 2) return 1;

        int moves = 1;
        int maxAdditionalMoves = 0;

        // Try all three types of moves for the remaining array
        // 1. First two elements
        if (end - start >= 2 && A[start] + A[start+1] == targetSum) {
            maxAdditionalMoves = Math.max(maxAdditionalMoves,
                    countMoves(A, targetSum, start+2, end));
        }

        // 2. Last two elements
        if (end - start >= 2 && A[end-1] + A[end-2] == targetSum) {
            maxAdditionalMoves = Math.max(maxAdditionalMoves,
                    countMoves(A, targetSum, start, end-2));
        }

        // 3. First and last elements
        if (end - start >= 2 && A[start] + A[end-1] == targetSum) {
            maxAdditionalMoves = Math.max(maxAdditionalMoves,
                    countMovesFirstLast(A, targetSum, start+1, end-1));
        }

        return moves + maxAdditionalMoves;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] A1 = {3, 1, 5, 3, 3, 4, 2};
        System.out.println("Test case 1: Expected = 3, Got = " + solution.solution(A1));

        // Test case 2
        int[] A2 = {4, 1, 4, 3, 3, 2, 5, 2};
        System.out.println("Test case 2: Expected = 4, Got = " + solution.solution(A2));

        // Test case 3
        int[] A3 = {1, 9, 1, 1, 1, 1, 1, 1, 8, 1};
        System.out.println("Test case 3: Expected = 1, Got = " + solution.solution(A3));

        // Test case 4
        int[] A4 = {1, 9, 8, 9, 5, 1, 2};
        System.out.println("Test case 4: Expected = 3, Got = " + solution.solution(A4));

        // Test case 5
        int[] A5 = {1, 1, 2, 3, 1, 2, 2, 1, 1, 2};
        System.out.println("Test case 5: Expected = 4, Got = " + solution.solution(A5));

        // Additional edge cases
        int[] A6 = {1, 2};  // Minimum length array
        System.out.println("Edge case 1 (length=2): Expected = 1, Got = " + solution.solution(A6));

        int[] A7 = {1};  // Array too short
        System.out.println("Edge case 2 (length=1): Expected = 0, Got = " + solution.solution(A7));

        int[] A8 = {1, 1, 1, 1};  // All same numbers
        System.out.println("Edge case 3 (all same): Expected = 2, Got = " + solution.solution(A8));
    }
}