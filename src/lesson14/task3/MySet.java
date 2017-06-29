package lesson14.task3;

        import java.util.HashSet;
        import java.util.Set;

/**
 * Created by roman_v on 26.06.17.
 */
public class MySet {
    public static void main(String[] args) {
        Set<Integer> union = new HashSet<>();
        Set<Integer> intersect = new HashSet<>();

        union.add(2);
        union.add(3);
        union.add(22);
        union.add(5);
        union.add(19);
        union.add(94);
        union.add(2);

        intersect.add(3);
        intersect.add(22);
        intersect.add(60);
        intersect.add(52);
        intersect.add(2);

        union.removeAll(intersect);
        System.out.println(union);

        union.addAll(intersect);
        System.out.println(union);
    }
}
