package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestThreadJoint {

    public static void main(String[] args) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = new Thread();
        
        t1.start();
        
        try {
            t2.join();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        t2.start();
    }
}
