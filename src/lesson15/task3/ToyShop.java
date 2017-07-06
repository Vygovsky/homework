package lesson15.task3;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by roman_v on 06.07.17.
 */
public class ToyShop {
    public static void main(String[] args) {
        Map<String, Double> toys = new HashMap<>();
        toys.put("Doll", 250.30);
        toys.put("Car", 270.0);
        toys.put("Football", 300.60);
        toys.put("Frog", 58.65);

        Set<String> set2 = toys.keySet();
        for (String toy2 : set2) {
            System.out.println(toy2);

        }
        System.out.println();
        Set<Map.Entry<String, Double>> set = toys.entrySet();
        for (Map.Entry<String, Double> toy : set) {
            System.out.print(toy.getKey() + ": ");
            System.out.println(toy.getValue());
        }
    }
}
