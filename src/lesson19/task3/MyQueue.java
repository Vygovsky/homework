package lesson19.task3;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue<T> {
    Queue<T> myQueue = new ArrayDeque<>();

    public synchronized T get() {
        while (myQueue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Пoлyчeнo: " + Thread.currentThread().getName());
        return myQueue.poll();
    }

    public synchronized void put(T n) {
        myQueue.offer(n);
        notify();
    }
    public int size(){
        return myQueue.size();
    }
}
