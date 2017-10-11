package testThreadYield;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {

    public void run() {
        int i = 1;
        while (i<=5) {
            try {
                Thread.sleep(2000);
            } 
            catch (InterruptedException e) {
                Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, e);
            }
            System.out.println("Thread start running...");
            i++;
            if (i==3) {
                break;
            }
        }
        
    }

    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
    }
}
