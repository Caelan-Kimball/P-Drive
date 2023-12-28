package threadtester;

/**
 *
 * @author Caelan Kimball
 * Date: 4/30/2019
 */
public class ThreadTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Runnable threadJob = new MyRunnable();
        Thread myThread = new Thread(threadJob);
        
        myThread.start();
        
        System.out.println("back in main");
    }

}

class MyRunnable implements Runnable {

    public void run() {
        go();
    }

    public void go() {
        try{
        Thread.sleep(2000);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        doMore();
    }

    public void doMore() {
        System.out.println("top o' the stack");
    }

}
