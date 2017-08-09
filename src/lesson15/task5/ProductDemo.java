package lesson15.task5;

import lesson14.task5.Product;

import java.util.*;

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

        printInfo(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        },false);

        printInfo(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getCost().compareTo(o2.getCost());
            }
        },false);

        printInfo(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getRating().compareTo(o2.getRating());
            }
        },false);
    }

    public static void printInfo(List<Product> products, Comparator<Product> comparator, boolean order) {
        Collections.sort(products, comparator);
        if (!order) {
            Collections.reverse(products);
        }
        System.out.printf("%-25S    %-10S    %S\n", "Товар", "Цена", "Рейтинг ");
        for (Product element2 : products) {
            System.out.printf("%-25s    %-10S    %s\n", element2.getName(), element2.getCost(), element2.getRating());
        }
        System.out.println();
        //Collections.reverse( products);
    }
}
