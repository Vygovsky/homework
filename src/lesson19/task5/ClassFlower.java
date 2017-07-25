package lesson19.task5;

import lesson8.flowers.Flower;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Roman_v on 24.07.2017.
 */
public class ClassFlower {
    public static void main(String[] args) {
        Class flower = Flower.class;
        System.out.println(flower.getName());
        System.out.println("saff "+Arrays.toString(flower.getDeclaredClasses()));
        System.out.println(Arrays.toString(flower.getDeclaredConstructors()));
        System.out.println(Arrays.toString(flower.getDeclaredFields()));
        System.out.println(Arrays.toString(flower.getDeclaredMethods()));
        for (Method flow : flower.getDeclaredMethods()) {
            System.out.println(flow);

        }
    }
}
