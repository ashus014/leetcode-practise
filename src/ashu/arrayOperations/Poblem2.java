package src.ashu.arrayOperations;

public class Poblem2 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5};
        int n = 5;
        System.out.println("The missing number is  :: " + findMissingNumber(a, n));
    }

    private static int findMissingNumber(int[] a, int n) {

        int XOR1 = 0;
        int XOR2 = 0;

//        for(int i=0; i<a.length; i++) {
//            XOR1 ^= a[i];
//        }
//
//        for(int i=0; i<n; i++) {
//            XOR2 ^= (i + 1);
//        }

        for(int i=0; i< a.length; i++) {
            XOR1 ^= a[i];
            XOR2 ^= (i + 1);
        }
        XOR2 ^= n;
        return XOR1 ^ XOR2;
    }
}
