package L56.task5;

    import java.util.Arrays;

/**
 * Created by Roman_v on 29.05.2017.
 */
public class DemoSorter {
    public static void main(String[] args) {
        int[][] data = {
            {4, 1, 7, -5, -5, 6, 6, 0, 8},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            SelectionSorter.sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
}

