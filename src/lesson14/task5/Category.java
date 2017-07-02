package lesson14.task5;

import java.util.SortedSet;

/**
 * Created by roman_v on 30.06.17.
 */
public class Category {
    private String name;
   SortedSet<Product> products;


    public Category(String name, SortedSet<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortedSet<Product> getProducts() {
        return products;
    }

    public void setProducts(SortedSet<Product> products) {
        this.products = products;
    }
}
