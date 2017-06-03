package L10.task9;

/**
 * Created by Roman_v on 03.06.2017.
 */
public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println("Печатает журнал");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magazine magazine = (Magazine) o;

        return name.equals(magazine.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}