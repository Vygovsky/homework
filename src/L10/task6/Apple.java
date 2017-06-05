package L10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Apple extends Fruit {
    public enum Apples {
        MAKENTOSH(15),
        GREEN_SMIT(12.30),
        LIGOL(14.56);

        private double cost;

        Apples(double cost) {
            this.cost = cost;
        }

        public double getCost() {
            return cost;
        }
    }

    public Apple apple;

    public Apple(String name, Apples makentosh) {
        super(name);
        this.apple = apple;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public double cost() {
        return apple.cost();
    }
}