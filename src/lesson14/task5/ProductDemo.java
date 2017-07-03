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
        ProdNameComporator nameComporator = new ProdNameComporator();
        SortedSet<Product> products1 = new TreeSet<>(nameComporator);
        ProdRatingComporator ratingComporator = new ProdRatingComporator();
        SortedSet<Product> products2 = new TreeSet<>(ratingComporator);
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
        System.out.printf("%-25S    %-10S    %S\n", "Товар", "Цена", "Рейтинг ");
        for (Product element : products) {
            System.out.printf("%-25s    %-10S    %s\n", element.getName(), element.getCost(), element.getRating());

        }
        System.out.println();
        products1.add(new Product("Рубашка", 125.35, 1));
        products1.add(new Product("Брюки", 350, 2));
        products1.add(new Product("Футболка", 2205, 3));
        products1.add(new Product("Трусы", 600, 4));
        products1.add(new Product("Джинсы", 1365.50, 3));
        products1.add(new Product("Рубашка", 155, 1));
        products1.add(new Product("Брюки", 480, 2));
        products1.add(new Product("Футболка", 225, 3));
        products1.add(new Product("Трусы", 800, 4));
        products1.add(new Product("Джинсы", 900, 5));
        System.out.printf("%-25S    %-10S    %S\n", "Товар", "Цена", "Рейтинг ");
        for (Product element1 : products1) {
            System.out.printf("%-25s    %-10S    %s\n", element1.getName(), element1.getCost(), element1.getRating());
        }
        System.out.println();
        products2.add(new Product("Рубашка", 125.35, 1));
        products2.add(new Product("Брюки", 350, 2));
        products2.add(new Product("Футболка", 2205, 3));
        products2.add(new Product("Трусы", 600, 4));
        products2.add(new Product("Джинсы", 1365.50, 3));
        products2.add(new Product("Рубашка", 155, 1));
        products2.add(new Product("Брюки", 480, 2));
        products2.add(new Product("Футболка", 225, 3));
        products2.add(new Product("Трусы", 800, 4));
        products2.add(new Product("Джинсы", 900, 5));
        System.out.printf("%-25S    %-10S    %S\n", "Товар", "Цена", "Рейтинг ");
        for (Product element2 : products2) {
            System.out.printf("%-25s    %-10S    %s\n", element2.getName(), element2.getCost(), element2.getRating());

        }
    }
}
