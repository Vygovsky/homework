package lesson10.task4;

/**
 * Created by Lesya on 25.06.2017.
 */
public class B extends A {
    void printInfoB() {
        System.out.println("Перемення a не доступна из класса B ");
        System.out.println("Print b: " + b);
        System.out.println("Print c: " + c);
        System.out.println("Print d: " + d);
    }
}
