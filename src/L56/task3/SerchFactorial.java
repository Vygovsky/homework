package L56.task3;
import java.util.Random;
/**
 * Реализовать подсчет факториала используя цикл for.
 * Created by Roman_v on 15.05.2017.
 */
public class SerchFactorial {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10);
        Factorial factorial = new Factorial();
        System.out.println(n + " != " + factorial.factor(n));
    }
}


