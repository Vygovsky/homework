package lesson13.task2;

/**
 * Created by roman_v on 26.06.17.
 */
public class MinMax<T extends Number> {
    private T[] arr;

    public MinMax(T[] arr) {
        this.arr = arr;
    }

    public double minNumb() {
        T min = arr[0];
        for (T i : arr) {
            if (i.doubleValue() < min.doubleValue()) {
            }
            min = i;
        }
        return min.doubleValue();
    }

    public double maxNumb() {
        T max = arr[0];
        for (T i : arr) {
            if (i.doubleValue() > max.doubleValue()) {
            }
            max = i;
        }
        return max.doubleValue();
    }
}

