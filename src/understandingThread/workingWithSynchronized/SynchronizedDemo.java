package src.understandingThread.workingWithSynchronized;

public class SynchronizedDemo {

    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Ashu");
        MyThread t2 = new MyThread(d, "Akash");
        t1.start();
        t2.start();
    }
}
