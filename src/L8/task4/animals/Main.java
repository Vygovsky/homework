package L8.task4.animals;

import L8.task4.cat.Cat;
import L8.task4.dog.Dog;
import L8.task4.horse.Horse;

/**
 * Created by roman_v on 31.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat(" Дом", "Корм", 2, 2.5, "Муська", 5),
                new Cat("Квартира", "Раба", 5, 3, "Кузя", 8),
                new Cat("Дом", "Молоко", 12, 12, "Ленин", 3)};
    }
        Dog[] dogs={
            new Dog("Двор","Кость",3,6,"Шарик",9),
            new Dog("Квартира","Корм для собак",8,2,"Номи",12),
            new Dog("Квартира","Все ест",6,9,"Арчебальд",14.5),
    };
    Horse[] horses={
        //    new Horse("Квартира","Все ест",6,9,"Арчебальд",14.5),

    };
}