package src.understandingThread.workingWithSleep;

public class MyThread extends Thread{


    public void run() {
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
