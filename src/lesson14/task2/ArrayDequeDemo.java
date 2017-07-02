package lesson14.task2;

import lesson14.task1.MyHeavyBox;

import java.util.Deque;
import java.util.ArrayDeque;

/**
 * Created by roman_v on 26.06.17.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<MyHeavyBox> qBox = new ArrayDeque<>();

        qBox.add(new MyHeavyBox());
        qBox.add(new MyHeavyBox());
        qBox.add(new MyHeavyBox());
        qBox.add(new MyHeavyBox());

        while (!qBox.isEmpty()) {
            System.out.println(qBox.remove() + " ");
        }
    }
}