package lesson10.task4.d;

import lesson10.task4.A;

/**
 * Created by Lesya on 25.06.2017.
 */
public class D extends A {
    void printInfoD(){
        System.out.println("Перемення a не доступна из класса D ");
        System.out.println("Print b: "+b);
        System.out.println("Перемення c не доступна из класса D ");
        System.out.println("Print d: "+d);
    }
}
