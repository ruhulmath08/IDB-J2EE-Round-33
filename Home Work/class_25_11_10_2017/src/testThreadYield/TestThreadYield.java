package testThreadYield;

public class TestThreadYield implements Runnable {

    Thread t;

    public TestThreadYield(String str) {
        t = new Thread(this, str);
        //this will call run() function
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            //Yield control to another thread every 5 iterations
            if ((i % 5) == 0) {
                System.out.println(Thread.currentThread().getName() + " Yield control....");

                /*causes the currentlythread object to temporarily push and allow other threads to execute*/
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName() + " Has finished execution...");
    }

}
