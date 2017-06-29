package lesson14.task4;

/**
 * Created by roman_v on 29.06.17.
 */
public class Stusent {
    private String name;
    private int course;

    public Stusent(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stusent stusent = (Stusent) o;

        if (course != stusent.course) return false;
        return name.equals(stusent.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + course;
        return result;
    }

    @Override
    public String toString() {
        return "Stusent{" + "name='" + name + '\'' + ", course=" + course + '}';
    }
}
