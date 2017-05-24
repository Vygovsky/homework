package L8.flowers;

/**
 * Created by student on 5/24/2017.
 */
public class Flower {
    private String name;
    private double cost;
    private static int count;

    public Flower(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        if (Double.compare(flower.cost, cost) != 0) return false;
        return !(name != null ? !name.equals(flower.name) : flower.name != null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    public static int getCount() {
        return count;
    }
}
