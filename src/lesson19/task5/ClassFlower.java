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
        System.out.println("Class name: "+flower.getName());
        System.out.println();
        System.out.println("Is classes: "+Arrays.toString(flower.getDeclaredClasses()));
        System.out.println();
        System.out.println("Is fields: "+Arrays.toString(flower.getDeclaredFields()));
        System.out.println();
        System.out.println("Is constructor: "+Arrays.toString(flower.getDeclaredConstructors()));
        System.out.println();
        System.out.println("Is methods: "+Arrays.toString(flower.getDeclaredMethods()));
        for (Method flow : flower.getDeclaredMethods()) {
            System.out.println(flow);

        }
    }
}
