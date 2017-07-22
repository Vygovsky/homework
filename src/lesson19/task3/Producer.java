package lesson19.task3;

/**
 * Created by Roman_v on 22.07.2017.
 */

public class Producer implements Runnable {
    MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println("Отправлено: "+i);
            i++;
        }
    }
}
