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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pear pear = (Pear) o;

        return name.equals(pear.name);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Pear{" + "name='" + name + '\'' + '}';
    }
}
