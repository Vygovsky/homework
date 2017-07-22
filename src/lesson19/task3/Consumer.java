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
        int i = 1;
        while (true) {
            System.out.println("Получено: "+myQueue.get());
            i++;
        }
    }
}