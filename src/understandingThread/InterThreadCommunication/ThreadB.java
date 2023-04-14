package src.understandingThread.InterThreadCommunication;

public class ThreadB extends Thread{

    int total = 0;

    public void run() {
        synchronized (this) {
            System.out.println("Chils thread starts calculation");
            for(int i=0; i<=100; i++) {
                total += i;
            }
            System.out.println("Child thread trying to give notification");
            this.notify();
        }
    }
}
