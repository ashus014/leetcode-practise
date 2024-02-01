package src.JSONTest;

public class Pilot {

    public static void main(String[] args) {

        int[] arr = {1,8,6,2,5,4,8,3,8};
        System.out.println(maxWater(arr));

    }

    private static int maxWater(int [] arr) {

        int MAX_WATER_CAPACITY = Integer.MIN_VALUE;

        for(int i=0; i< arr.length - 1; i++) {
            for(int j=0; j < arr.length; j++) {

                // find minimum
                int minValue = Math.min(arr[i], arr[j]);

                // check distance
                int distance = j - i;

                int temp = minValue * distance;

                if(temp > MAX_WATER_CAPACITY)
                    MAX_WATER_CAPACITY = temp;
            }
        }
        return MAX_WATER_CAPACITY;
    }
}
