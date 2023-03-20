package src.understandingThread;

public class ThreadDemo {

    public static void main(String[] args) {

        // Main thread instantiating child thread object
        MyThread t = new MyThread();

        // Main thread start child thread
        t.start();

        /*
        * start() {
        *
        * 1. Register this thread with Thread scheduler
        * 2. Perform all other mandatory activities
        * 3. Invoke run()
        * }
        *
        * */

        for(int i=0; i<10; i++) {
            System.out.println("Main Thread");
        }
    }
}
