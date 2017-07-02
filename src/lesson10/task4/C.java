package lesson10.task4;

/**
 * Created by Lesya on 25.06.2017.
 */
public class C {
    void printInfoC() {
        System.out.println("Перемення A не доступна из класса C ");
        System.out.println("Print b: " + new A().b);
        System.out.println("Print c: " + new A().c);
        System.out.println("Print d: " + new A().d);
    }
}
