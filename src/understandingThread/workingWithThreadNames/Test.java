package src.understandingThread.workingWithThreadNames;

public class Test {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        // Prints : main
        MyThread t= new MyThread();
        System.out.println(t.getName());
        // Prints default Name provided by JVM : Thread-0

        Thread.currentThread().setName("Ashu Singh");
        System.out.println(Thread.currentThread().getName());
        // Prints : Ashu Singh
    }
}
