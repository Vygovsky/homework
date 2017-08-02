package lesson15.task5;

import java.util.*;

/**
 * Created by roman_v on 30.06.17.
 */
public class ProductDemo {
    public static void main(String[] args) {
      //ProdCostComporator costComporator = new ProdCostComporator();
        List<Product> products = new ArrayList<>();
    //    ProdNameComporator nameComporator = new ProdNameComporator();
        List<Product> products1 = new ArrayList<>();
     //  ProdRatingComporator ratingComporator = new ProdRatingComporator();
        List<Product> products2 = new ArrayList<>();

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
        products1.addAll(products);

        Collections.reverse(products);
        printInfo(products1);
        products2.addAll(products);
        printInfo(products2);
    }

    public static void printInfo(List<Product> products) {
        System.out.printf("%-25S    %-10S    %S\n", "Товар", "Цена", "Рейтинг ");
        for (Product element2 : products) {
            System.out.printf("%-25s    %-10S    %s\n", element2.getName(), element2.getCost(), element2.getRating());

        }
        System.out.println();
    }
}
