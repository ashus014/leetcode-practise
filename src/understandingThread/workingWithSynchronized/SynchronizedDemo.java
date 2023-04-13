package src.understandingThread.workingWithSynchronized;

public class SynchronizedDemo {

    public static void main(String[] args) {
        Display d1 = new Display();
        Display d2 = new Display();
        MyThread t1 = new MyThread(d1, "Ashu");
        MyThread t2 = new MyThread(d2, "Akash");
        t1.start();
        t2.start();

        /**
         *  synchronized(Display.class) {
         *      // If a thread gets class level lock of "Display" class,
         *      // then only it is allowed to execute
         *      // this area.
         *  }
         *
         * */
    }
}
