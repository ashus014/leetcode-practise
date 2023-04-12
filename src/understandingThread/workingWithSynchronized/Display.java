package src.understandingThread.workingWithSynchronized;

public class Display {

    public synchronized void wish(String name) {

        for(int i=0; i<5; i++) {
            System.out.print("Good Morning : ");

            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println(name);
        }
    }
}
