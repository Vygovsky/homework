package lesson10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Apple extends Fruit {
    private String name;

    public Apple(String name, double cost) {
        super(name, cost);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Apple apple = (Apple) o;

        return name.equals(apple.name);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Apple{" + "name='" + name + '\'' + '}';
    }
}