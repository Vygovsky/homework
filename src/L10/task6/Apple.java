package L10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Apple extends Fruit {
    private String name;

    public Apple(String sortName, double cost) {
        super(sortName, cost);
    }

    @Override
    public double cost() {
        return this.getCost();
    }

    public String getNameSort() {
        return name;
    }

    public void setNameSort(String nameSort) {
        this.name = nameSort;
    }
}