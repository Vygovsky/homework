package lesson19.task3;

/**
 * Created by Roman_v on 22.07.2017.
 */
public class ProducerDemo {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        Consumer consumer1 = new Consumer(myQueue);
        Consumer consumer2 = new Consumer(myQueue);
        Producer producer = new Producer(myQueue);

        Thread t3 = new Thread(producer);
        Thread t1 = new Thread(consumer1);
        Thread t2= new Thread(consumer2);

        t3.start();
        t2.start();
        t1.start();
    }
}
