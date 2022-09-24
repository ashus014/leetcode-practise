package src.leetCodeProblems;

public class Problem2409 {
    public static void main(String[] args) {
        
        System.out.println(countDaysTogether("08-15", "08-18", "08-16", "08-19"));
    }
    public static int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int arriveAliceMonth = Integer.valueOf(arriveAlice.substring(0,2));
        int arriveAliceDate = Integer.valueOf(arriveAlice.substring(3));

        int arriveBobMonth = Integer.valueOf(arriveAlice.substring(0,2));
        int arriveBobDate = Integer.valueOf(arriveAlice.substring(3));
        System.out.println(arriveAliceDate);
        return 0;
    }

}
