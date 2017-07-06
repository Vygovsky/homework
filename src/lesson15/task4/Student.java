package lesson15.task4;

/**
 * Created by roman_v on 06.07.17.
 */
public class Student {
    private String name;
    private int course;
    private String group;

    public Student(String name, int course, String group) {
        this.name = name;
        this.course = course;
        this.group = group;
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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
