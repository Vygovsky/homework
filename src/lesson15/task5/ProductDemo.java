package lesson15.task5;

import java.util.*;

/**
 * Created by roman_v on 30.06.17.
 */
public class ProductDemo {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

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

       printInfo(products);

        Collections.reverse(products);

    }

    public static void printInfo(List<Product> products) {
        System.out.printf("%-25S    %-10S    %S\n", "Товар", "Цена", "Рейтинг ");
        for (Product element2 : products) {
            System.out.printf("%-25s    %-10S    %s\n", element2.getName(), element2.getCost(), element2.getRating());
            Collections.sort();
        }
        System.out.println();
        Collections.reverse( products);
    }
}
