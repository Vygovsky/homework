package lesson25;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private int id;
    private String name;
    private double price;
    private List<Genre> genres = new ArrayList<>();

    public Book(int id, String name, double price, List<Genre> genres) {
        this.genres = genres;
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }


}
