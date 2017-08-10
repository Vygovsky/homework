package lesson16.task2;

import lesson11.task2.Size;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Good implements Serializable {
    private int id;
    private String name;
    private Size size;

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
        if (!name.equals(good.name)) return false;
        return size == good.size;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + size.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
