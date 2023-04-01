package src.understandingThread;

public class MyThread extends Thread {

    public void start() {
        super.start();
        System.out.println("Start Method");
    }

    public void run() {
        System.out.println("Run Method");
    }
}
