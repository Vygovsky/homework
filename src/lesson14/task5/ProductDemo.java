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
        products.add(new Product("Брюки", 350, 2));
        products.add(new Product("Футболка", 2205, 3));
        products.add(new Product("Трусы", 600, 4));
        products.add(new Product("Джинсы", 1365.50, 3));
        products.add(new Product("Рубашка", 155, 1));
        products.add(new Product("Брюки", 480, 2));
        products.add(new Product("Футболка", 225, 3));
        products.add(new Product("Трусы", 800, 4));
        products.add(new Product("Джинсы", 900, 5));
        System.out.printf("%-25S    %-10S    %S\n", "Товар",  "Цена", "Рейтинг ");
        for (Product element : products) {
            System.out.printf("%-100s ", element);
            System.out.println(element);
        }
    }
}
