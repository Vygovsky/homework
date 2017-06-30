package lesson14.task5;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by roman_v on 30.06.17.
 */
public class ProductDemo {
    public static void main(String[] args) {
        ProdCostComporator costComporator = new ProdCostComporator();
        SortedSet<Product> products = new TreeSet<>(costComporator);
        products.add(new Product("Рубашка", 125.35, 1));
        products.add(new Product("Брюки", 350, 1));
        products.add(new Product("Футболка", 2205, 1));
        products.add(new Product("Трусы", 600, 1));
        products.add(new Product("Джинсы", 1365.50, 1));
        products.add(new Product("Рубашка", 155, 1));
        products.add(new Product("Брюки", 480, 1));
        products.add(new Product("Футболка", 225, 1));
        products.add(new Product("Трусы", 800, 1));
        products.add(new Product("Джинсы", 900, 1));
        for (Product element : products) {
            System.out.println(element);
        }
    }
}
