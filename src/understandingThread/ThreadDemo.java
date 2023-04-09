package src.understandingThread;

public class ThreadDemo {

    public static void main(String[] args) {

        MyRunnable r = new MyRunnable();
        // target runnable
        Thread t = new Thread(r);


        t.start();

        /**
         * Thread class constructors
         *
         * 1. Thread t = new Thread()
         * 2. Thread t = new Thread(Runnable r)
         * 3. Thread t = new Thread(String name)
         * 4. Thread t = new Thread(Runnable r, String name)
         * 5. Thread t = new Thread(ThreadGroup g, String name)
         * 6. Thread t = new Thread(ThreadGroup g, Runnable r)
         * 7. Thread t = new Thread(ThreadGroup g, Runnable r, String name)
         * 8. Thread t = new Thread(ThreadGroup g, Runnable r, String name, long stackSize)
         *
         * */


    }
}
