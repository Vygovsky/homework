package lesson14.task5;

import java.util.Comparator;

/**
 * Created by roman_v on 03.07.17.
 */
public class ProdNameComporator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        int name = o1.getName().compareTo(o2.getName());
        return name != 0 ? name : 1;
    }
}
