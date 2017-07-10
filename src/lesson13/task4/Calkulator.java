package lesson13.task4;


/**
 * Created by roman_v on 10.07.17.
 */
public class Calkulator {
    public static <T extends Number, V extends Number> double sum(T t, V v) {
        return (int) t.doubleValue() + v.doubleValue();
    }

    public static <T extends Number, V extends Number> double minus(T t, V v) {
        return (int) t.doubleValue() - v.doubleValue();
    }

    public static <T extends Number, V extends Number> double generation(T t, V v) {
        return (int) t.doubleValue() * v.doubleValue();
    }

    public static <T extends Number, V extends Number> double division(T t, V v) {
        return (int) t.doubleValue() / v.doubleValue();
    }
}
