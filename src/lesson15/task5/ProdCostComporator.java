package lesson15.task5;

import java.util.Comparator;

/**
 * Created by roman_v on 30.06.17.
 */
public class ProdCostComporator implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getCost().compareTo(o2.getCost());
    }
}
