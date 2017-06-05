package L9.task1;

import L8.flowers.Flower;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Rose extends Flower {
    public enum Brand2 {
        WHITE(45),
        BLUE(56),
        BURGUNDY(50);

        private double cost2;

        Brand2(double cost2) {
            this.cost2 = cost2;
        }

        public double getCost2() {
            return cost2;
        }
    }

    public Brand2 brand2;

    public Rose(String name, Brand2 brand2) {
        super(name);
        this.brand2 = brand2;
    }

    public Brand2 getBrand2() {
        return brand2;
    }

    public void setBrand2(Brand2 brand2) {
        this.brand2 = brand2;
    }

    @Override
    public double cost() {
        return brand2.cost2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rose rose = (Rose) o;

        return brand2 == rose.brand2;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + brand2.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Rose{" +
            "brand2=" + brand2 +
            '}';
    }
}
