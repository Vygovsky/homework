package lesson15.task5;

import lesson14.task5.Product;

import java.util.ArrayList;
import java.util.List;


public class Category {
    private String name;
    private List<Product> products;

    public Category(String name) {
        this.name = name;
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
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
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
