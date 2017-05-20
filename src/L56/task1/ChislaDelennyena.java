package L56.task1;
/**Распечатать все числа от 1 до 100, которые делятся на 5 без остатка. Используем цикл do-while.
 * Created by Roman_v on 15.05.2017.
 */
 public class ChislaDelennyena {
    public static void main(String[] args) {
        int x = 0;
        do {
            if (x % 5 == 0)
                System.out.println("Числа деленные на 5 равен: " + x);
            x++;
        } while (x < 100);
    }
}

