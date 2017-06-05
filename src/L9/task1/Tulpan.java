package L9.task1;

import L8.flowers.Flower;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Tulpan extends Flower {
    public enum Brand {
        YELLOW(15),
        RED(30),
        PINK(45.33);

        private double cost;

        Brand(double cost) {
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }
    }

    private Brand brand;

    public Tulpan(String name, Brand brand) {
        super(name);
        this.brand = brand;
    }

    public Tulpan(String name) {
        super(name);
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public double cost() {
        return brand.getCost();
    }
}
