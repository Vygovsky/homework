package lesson14.task2;

import lesson14.task1.MyHeavyBox;

import java.util.Deque;

/**
 * Created by roman_v on 26.06.17.
 */
public class ArrayDeque {
    public static void main(String[] args) {
        Deque<MyHeavyBox> qBox = new ArrayDeque<MyHeavyBox>();

        qBox.add(new MyHeavyBox());
        qBox.add(new MyHeavyBox());
        qBox.add(new MyHeavyBox());
        qBox.add(new MyHeavyBox());

        while (!queue.isEmpty()) {
            System.out.println(queue.remove() + " ");
        }
    }
}