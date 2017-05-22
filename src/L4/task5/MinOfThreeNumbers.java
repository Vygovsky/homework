package L4.task5;
import java.util.Scanner;
/**
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх
 * введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 * Created by Roman_v on 15.05.2017.
 */
public class MinOfThreeNumbers {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            int x = sc.nextInt();
            System.out.print("Введите второе число: ");
            int y = sc.nextInt();
            System.out.print("Введите третье число: ");
            int z = sc.nextInt();
            int minChislo = (x < y) ? (x < z) ? x : z : (y < z) ? y : z;
            System.out.println("Самое минимальное число равно: " + minChislo);
        }
    }
}
