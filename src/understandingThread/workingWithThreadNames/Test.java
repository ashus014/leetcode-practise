package src.understandingThread.workingWithThreadNames;

public class Test {

    public static void main(String[] args) {

        MyThread t = new MyThread();
        t.setPriority(10);
        t.start();
        System.out.println(t.getPriority());
        System.out.println(Thread.currentThread().getPriority());

        for(int i=0; i<10; i++) {
            System.out.println("Main Thread");
        }
    }

    /**
     * public static native void yield();
     *
     * */
}
