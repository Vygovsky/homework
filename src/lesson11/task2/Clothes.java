package lesson11.task2;

/**
 * Created by roman_v on 08.06.17.
 */
public abstract class Clothes {
    private int sizeClothes;
    private double cost;
    private String color;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clothes clothes = (Clothes) o;

        if (sizeClothes != clothes.sizeClothes) return false;
        if (Double.compare(clothes.cost, cost) != 0) return false;
        return color.equals(clothes.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = sizeClothes;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Clothes{" + "sizeClothes=" + sizeClothes + ", cost=" + cost + ", color='" + color + '\'' + '}';
    }
}
