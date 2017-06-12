package lesson10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Pear extends Fruit {
    private String name;

    public Pear(String name, double cost) {
        super(name, cost);
        this.name = name;
    }

    @Override
    public double cost() {
        return this.getCost();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
