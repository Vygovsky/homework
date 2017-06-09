package lesson11.task2;

/**
 * Created by roman_v on 08.06.17.
 */
public abstract class Clothes {
    private int sizeClothes;
    private double cost;
    private  String color;

    public Clothes(int sizeClothes, double cost, String color) {
        this.sizeClothes = sizeClothes;
        this.cost = cost;
        this.color = color;
    }

    public int getSizeClothes() {
        return sizeClothes;
    }

    public void setSizeClothes(int sizeClothes) {
        this.sizeClothes = sizeClothes;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
