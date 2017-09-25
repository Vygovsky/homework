package lesson16.task2.entity;

import lesson11.task2.Size;

import java.io.Serializable;

public class Good implements Serializable {
    private int id;
    private String name;
    private Size size;
    private int categoryID;
    private double price;
    private int rank;

    public Good() {
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Good(int id, String name, Size size) {
        this.id = id;
        this.name = name;
        this.size = size;
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

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Good good = (Good) o;

        if (id != good.id) return false;
        if (categoryID != good.categoryID) return false;
        if (Double.compare(good.price, price) != 0) return false;
        if (rank != good.rank) return false;
        if (name != null ? !name.equals(good.name) : good.name != null) return false;
        return size == good.size;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + categoryID;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + rank;
        return result;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                ", categoryID=" + categoryID +
                ", price=" + price +
                ", rank=" + rank +
                '}';
    }
}
