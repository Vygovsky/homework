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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (!name.equals(category.name)) return false;
        return products.equals(category.products);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + products.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Category{" + "name='" + name + '\'' + ", products=" + products + '}';
    }
}
