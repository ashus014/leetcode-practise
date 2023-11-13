package src.ashu.RoadTo57Days.Practise.Recursion;

public class Problem24_count_inversion {

    public static void main(String[] args) {

        int[] arr = {5,3,2,4,1};
        System.out.println(findSolutionBruteForceApproach(arr));

    }

    private static int findSolutionBruteForceApproach(int[] arr) {

        int result = 0;
        if(arr.length < 3)
            return 0;

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    result++;
                    System.out.println(arr[i] + " & " + arr[j]);
                }
            }
        }
        System.out.println("+++++++++");
        return result;
    }
}
