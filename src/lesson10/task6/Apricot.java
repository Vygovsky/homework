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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Apricot apricot = (Apricot) o;

        return name.equals(apricot.name);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Apricot{" + "name='" + name + '\'' + '}';
    }
}

