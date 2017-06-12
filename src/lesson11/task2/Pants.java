package lesson11.task2;

/**
 * Created by roman_v on 09.06.17.
 */
public class Pants extends Clothes implements MenClothes, WomenClothes {

    public Pants(Size sizeClothes, double cost, String color) {
        super(sizeClothes, cost, color);
    }

    @Override
    public void clotheMan() {
        System.out.println("Штаны");
    }

    @Override
    public void clotheWomen() {
        System.out.println("Брюки");
    }
}
