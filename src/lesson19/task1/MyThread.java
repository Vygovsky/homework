package lesson19.task1;

/**
 * Created by roman_v on 18.07.17.
 */
public class MyThread implements Runnable {
    public void run() {
        for (int x = 1; x < 100; x++) {
            if (x % 10 == 0) {
                System.out.println("Run by " + Thread.currentThread().getName() + ", x is " + x);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
