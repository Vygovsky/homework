package lesson19.task1;

/**
 * Created by roman_v on 18.07.17.
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread myFirstRunnel = new MyThread();
        Thread one = new Thread(myFirstRunnel);
        one.setName("First potok");
        Thread two = new Thread(myFirstRunnel);
        two.setName("Second potok");
        Thread three = new Thread(myFirstRunnel);
        three.setName("Third potok");

        one.start();
        two.start();
        three.start();
    }
}

