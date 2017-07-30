package lesson16.task2;

import lesson11.task2.Size;

import java.util.ArrayList;
import java.util.List;

public class Good {
    private int id;
    private String name;
    private List<Size> sizes = new ArrayList<>();

    public Good(int id, String name, Size... sizes) {
        this.id = id;  // делать уникальнім
        this.name = name;

        for (Size size : sizes) {
            this.sizes.add(size);
        }
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

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }
}
