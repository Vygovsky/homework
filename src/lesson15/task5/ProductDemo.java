package lesson15.task5;

import lesson14.task5.Product;

import java.util.*;

public class ProductDemo {
    public static void main(String[] args) {
        List<Category> products = new ArrayList<>();

        products.add(new Category(new Product("Рубашка", 125.35, 1)));
        products.add(new Category("Брюки", 350, 2));
        products.add(new Category("Футболка", 2205, 3));
        products.add(new Category("Трусы", 600, 4));
        products.add(new Category("Джинсы", 1365.50, 3));
        products.add(new Category("Рубашка", 155, 1));
        products.add(new Category("Брюки", 480, 2));
        products.add(new Category("Футболка", 225, 3));
        products.add(new Category("Трусы", 800, 4));
        products.add(new Category("Джинсы", 900, 5));

        printInfo(products, new Comparator<Category>() {
            @Override
            public int compare(Category o1, Category o2) {
                return o1.getName().compareTo(o2.getName());}
            },false);

 /*           @Override
            public int compare(Category o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }, false);

        printInfo(products, new Comparator<Product>() {
            @Override
            public int compare(Category o1, Product o2) {
                return o1.getCost().compareTo(o2.getCost());
            }
        }, false);

        printInfo(products, new Comparator<Product>() {
            @Override
            public int compare(Category o1, Product o2) {
                return o1.getRating().compareTo(o2.getRating());
            }
        }, false);
    }
*/
    public static void printInfo(List<Category> categories, Comparator<Category> comparator, boolean order) {
        Collections.sort(categories, comparator);
        if (!order) {
            Collections.reverse(categories);
        }
        System.out.printf("%-25S    %-10S    %S\n", "Товар", "Цена", "Рейтинг ");
        for (Category element2 : categories) {
            System.out.printf("%-25s    %-10S    %s\n", element2.getName(), element2.getCost(), element2.getRating());
        }
        System.out.println();
    }
}
