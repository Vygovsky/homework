package lesson14.task3;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by roman_v on 26.06.17.
 */
public class MySet {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> set4 = new HashSet<>();

        set1.add(6);
        set1.add(8);
        set1.add(20);
        set1.add(2);
        set3.add(6);
        set3.add(6);
        set3.add(91);
        set3.add(59);
     //  union(set1).size();
        set2.add(1);
        set2.add(26);
        set2.add(9);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(12);
        set4.add(12);
        set4.add(1);
        set4.add(16);
        set4.add(9);
        set4.add(129);
        set4.add(1111);
    //    intersect()
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);
        return set1;
    }

    public static Set<Integer> intersect(Set<Integer> set3, Set<Integer> set4) {
        set3.retainAll(set4);
        return set3;
    }

}
