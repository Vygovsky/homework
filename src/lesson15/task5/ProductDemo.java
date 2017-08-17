package lesson15.task5;

import lesson14.task5.Product;

import java.util.*;

public class ProductDemo {
    public static void main(String[] args) {
        Category category = new Category("Одежда");
        category.setProducts(Arrays.asList(
                new Product("Рубашка", 125.35, 1),
                new Product("Брюки", 350, 2),
                new Product("Футболка", 2205, 3),
                new Product("Трусы", 600, 4),
                new Product("Джинсы", 1365.50, 3),
                new Product("Рубашка", 155, 1),
                new Product("Футболка", 225, 3),
                new Product("Трусы", 800, 4),
                new Product("Джинсы", 900, 5)
        ));
        printInfo(category, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }, false);

        printInfo(category, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getCost().compareTo(o2.getCost());
            }
        }, false);

        printInfo(category, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getRating().compareTo(o2.getRating());
            }
        }, false);
    }

    public static void printInfo(Category category, Comparator<Product> comparator, boolean order) {
        Collections.sort(category.getProducts(), comparator);
        if (!order) {
            Collections.reverse(category.getProducts());
        }
        System.out.printf("%-25S    %-10S    %S\n", "Товар", "Цена", "Рейтинг ");
        for (Product p : category.getProducts()) {
            System.out.printf("%-25s    %-10S    %s\n", p.getName(), p.getCost(), p.getRating());
        }
        System.out.println();
    }
}
