package src.leetcodeweekly.week1;

public class Main {


    public static void main(String[] args) {

        System.out.println(findDelayedArrivalTime(23, 23));
    }

    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }
}
