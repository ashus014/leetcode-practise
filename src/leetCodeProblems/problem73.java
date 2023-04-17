package src.leetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class problem73 {

    class Coordinates {
        int x=0,y = 0;

        public Coordinates() {
        }

        public Coordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };
        problem73 p = new problem73();
        p.setZeroes(matrix);
    }

    public void setZeroes(int[][] matrix) {

        int count = 0;
        Map<Integer, Coordinates> map = new HashMap<>();
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    map.put(count++, new Coordinates(i,j));
                }
            }
        }

        for(int i=0; i< map.size(); i++) {
            Coordinates coordinates = new Coordinates();
            coordinates = map.get(i);
            int xCoordinate = coordinates.x;
            int yCoordinate = coordinates.y;
            for(int j=0; j< matrix[0].length; j++)
                matrix[xCoordinate][j] = 0;
            for(int k=0; k< matrix.length; k++)
                matrix[k][yCoordinate] = 0;
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
