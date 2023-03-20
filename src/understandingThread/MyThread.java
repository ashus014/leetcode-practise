package src.understandingThread;

public class MyThread extends Thread {

    // Defining a thread
    public void run() {

        // Job of thread
        for(int i=0; i<10; i++) {
            System.out.println("Child Thread");
        }

    }
}
