package lesson10.task4.f;

import lesson10.task4.A;

/**
 * Created by Lesya on 25.06.2017.
 */
public class F {
    void printInfoF() {
        System.out.println("Перемення a не доступна из класса A ");
        System.out.println("Перемення b не доступна из класса A ");
        System.out.println("Перемення a не доступна из класса A ");
        System.out.println("Print d: " + new A().d);
    }
}