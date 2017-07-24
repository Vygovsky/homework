package lesson19.task3;

/**
 * Created by Roman_v on 22.07.2017.
 */
public class Consumer implements Runnable {
    MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Получено: " + myQueue.get() + " " + Thread.currentThread().getName());
        }
    }
}
