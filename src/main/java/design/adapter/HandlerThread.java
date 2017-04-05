package design.adapter;

/**
 * Created by focus on 17/2/17.
 */
public class HandlerThread extends Thread {
    private int i = 0;
    String ss = "123";
    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            System.out.println("000000");
            i = 1;
            notifyAll();
            Runnable runnable = null;
            runnable.run();
        }
    }

    public void getLooper() {
        synchronized (this) {
            System.out.println("1111111");
            while (i == 0) {
                System.out.println("2222222");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("3333333");
            }
        }
        System.out.println("444444");
    }
}
