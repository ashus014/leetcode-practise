package src.DSASheetForDataStructures.SearhingAndSorting;

public class Question4 {
    
    public static void main(String[] args) {
        
    }

    static int countSquares(int N) {
        // code here
        int count = 0;
        for (int i=1; i<N; i++) {
            if (i*i >= N) {
                break;
            }
            else {
                count++;
            }
        }
        return count;
    }
}
