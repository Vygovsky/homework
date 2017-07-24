package lesson19.task5;

import lesson8.flowers.Flower;

import java.util.Arrays;

/**
 * Created by Roman_v on 24.07.2017.
 */
public class ClassFlower {
    public static void main(String[] args) {
        Class flower = Flower.class;
        System.out.println(flower.getClass());
        System.out.println(Arrays.toString(flower.getDeclaredClasses()));
        System.out.println(Arrays.toString(flower.getDeclaredConstructors()));
        System.out.println(Arrays.toString(flower.getDeclaredMethods()));
        System.out.println(Arrays.toString(flower.getDeclaredFields()));
    }
}
