package src.understandingThread.workingWithSleep;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {


        for(int i=0; i<10;i++) {
            System.out.println("Slide - " + i);
            Thread.sleep(5000);
        }
        /**
         *
         * public static native void sleep(long ms) throws InterruptedException
         * public static void sleep(long ms, int ns) throws InterruptedException
         *
         */
    }
}
