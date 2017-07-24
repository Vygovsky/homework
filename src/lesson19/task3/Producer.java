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
        int i = 0;
        while (true) {
            if (myQueue.size() > 3) {
                System.out.println("Отправлено: " + i++);
                myQueue.put("String " + i);
            }
        }
    }
}
