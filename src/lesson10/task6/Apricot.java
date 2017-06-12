package lesson10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Apricot extends Fruit {
    private String name;

    public Apricot(String name, double cost) {
        super(name, cost);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double cost() {
        return this.getCost();
    }
}

