package src.ashu.arrayOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Singleton class
public class Problem3 {
//    static boolean isInstanceAvailable = false;
//    static private Problem3 problem3;
//
//    public static Problem3 getInstance() {
//        if(!isInstanceAvailable) {
//            problem3 = new Problem3();
//            return problem3;
//        }
//        return problem3;
//    }


    public static void main(String[] args) {


        //list of numbers
        List<Integer> list = Arrays.asList(1, 5, 2, 7, 11, 15);
//        System.out.println("The prime numbers are : " + findPrimes(list));
        System.out.println("The list in ascending order : " + ascendingOrder(list));

    }

    private static List<Integer> findPrimes(List<Integer> list) {

        List<Integer> result = new ArrayList<>();

//        int size = list.size();
//        for (int i = 0; i < size; i++) {
//            for(int j=1; j <= result.get(i)/2; j++) {
//                if(list.get(i) % j == 0)
//                    result.add(list.get(i));
//            }
//        }





        return result;
    }

    private static List<Integer> ascendingOrder(List<Integer> list) {

        List<Integer> result = new ArrayList<>();

        int listSize = list.size();

        for(int i = 0; i< listSize; i++) {
            for(int j = 0; j < listSize; j++) {
//                if
            }
        }

        // using streams


        return result;
    }

    private void swapElements(List<Integer> list, int indexOne, int indexTwo) {

//        int temp = lis
    }



    // Controller

//    @RestController
//    @Requestmappin("/v1/userChecks")
//    public ResponseEntity checkUserCredentials(@Pathvariable String uname, @Pathvariable String passwerod) {
//
//
//    }
//
//    // Sertvice
//
//    @Service
//    class userCheckServiceImpl {
//
//
//
//    }
//
//
//    HIbernate
    





}


