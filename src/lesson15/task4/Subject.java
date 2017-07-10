package lesson15.task4;

import java.util.Arrays;
import java.util.List;

/**
 * Created by roman_v on 06.07.17.
 */
public enum Subject {
    MATHEMATICS(Arrays.asList(1, 2, 3)),
    PHYSICS(Arrays.asList(1, 2, 3)),
    DRAWING(Arrays.asList(2, 3)),
    ENGINE_STRUCTURE(Arrays.asList(1, 2, 3, 4, 5)),
    TRANSMISSION(Arrays.asList(3, 4)),
    ELECTRONICS(Arrays.asList(3, 4, 5));
    public List<Integer> courses;

    Subject(List<Integer> courses) {
        this.courses = courses;
    }

    public List<Integer> getCourses() {
        return courses;
    }
}
