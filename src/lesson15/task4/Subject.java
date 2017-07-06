package lesson15.task4;

        import java.util.List;

/**
 * Created by roman_v on 06.07.17.
 */
public enum Subject {
    MATHEMATICS(1, 2, 3), PHYSICS(1, 2, 3), DRAWING(1, 2), ENGINE_STRUCTURE(1, 2, 3, 4, 5), TRANSMISSION(3, 4), ELECTRONICS(2, 3, 4);
    public List<Integer> courses;

    Subject(List<Integer> courses) {
        this.courses = courses;
    }
    public List<Integer> getCourses(){
        return courses;
    }
}
