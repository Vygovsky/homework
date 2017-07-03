package lesson14.task5;

import java.util.Comparator;

/**
 * Created by roman_v on 03.07.17.
 */
public class ProdRatingComporator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int rating = o1.getRating().compareTo(o2.getRating());
        return rating != 0 ? rating : 1;
    }
}
