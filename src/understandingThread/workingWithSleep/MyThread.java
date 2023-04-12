package src.understandingThread.workingWithSleep;

public class MyThread extends Thread{

    public static Thread mt;
    public void run() {

        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i <10;i++) {
            System.out.println("Seetha Thread");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
