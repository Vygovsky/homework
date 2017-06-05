package L9.task1;

import L8.flowers.Flower;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Exotic extends Flower {

    enum Brand3 {
        PHALAENOPSIS(452.36),
        SPREKELIA(556.89),
        LITHOPS(1103);

        private double cost3;

        Brand3(double cost3) {
            this.cost3 = cost3;
        }

        public double getCost3() {
            return cost3;
        }
    }

    private Brand3 brand3;

    public Exotic(String name, Brand3 brand3) {
        super(name);
        this.brand3 = brand3;
    }

    public Brand3 getBrand3() {
        return brand3;
    }

    public void setBrand3(Brand3 brand3) {
        this.brand3 = brand3;
    }

    @Override
    public double cost() {
        return brand3.cost3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Exotic exotic = (Exotic) o;

        return brand3 == exotic.brand3;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + brand3.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Exotic{" +
            "brand3=" + brand3 +
            '}';
    }
}
