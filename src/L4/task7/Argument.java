package L4.task7;
/**Вычислить среднее значение вещественных чисел передаваемых на вход программы в качестве аргументов.
 * Created by Roman_v on 15.05.2017.
 */
public class Argument {
    public static void main(String[] args) {
        double res = 0;
        for (int i = 0; i < args.length; i++) {
            res += Double.parseDouble(args[i]);
        }
        res /= args.length;
        System.out.println("Среднее значение аргументоа: " + res);
    }
}