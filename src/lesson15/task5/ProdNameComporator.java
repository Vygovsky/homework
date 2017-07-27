package lesson15.task5;

import java.util.Comparator;

/**
 * Created by roman_v on 03.07.17.
 */
public class ProdNameComporator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName()) >= 0 ? 1 : -1;
    }
}
