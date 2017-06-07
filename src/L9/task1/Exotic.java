package L9.task1;

import L8.flowers.Flower;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Exotic extends Flower {

    enum Brand {
        PHALAENOPSIS(452.36),
        SPREKELIA(556.89),
        LITHOPS(1103);

        private double cost;

        Brand(double cost) {
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }
    }

    private Brand brand;

    public Exotic(String name, Brand brand) {
        super(name);
        this.brand = brand;
    }

    public Brand getBrand3() {
        return brand;
    }

    public void setBrand3(Brand brand) {
        this.brand = brand;
    }

    @Override
    public double cost() {
        return brand.cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Exotic exotic = (Exotic) o;

        return brand == exotic.brand;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + brand.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Exotic{" +
            "brand3=" + brand +
            '}';
    }
}
