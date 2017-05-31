package L8.task4.Vet;

import L8.task4.animals.Animals;

/**
 * Created by student on 5/31/2017.
 */
public class Vet {
    public static void treatAnimal(Animals animals) {
        System.out.println(animals.getClass().getSimpleName()+" ест "+animals.getFood()+" и живет "+animals.getLocation());
    }
}
