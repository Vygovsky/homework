package lesson14.task5;

import java.util.Comparator;

/**
 * Created by roman_v on 03.07.17.
 */
public class ProdRatingComporator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getRating() >= o2.getRating() ? 1 : -1;
    }
}
