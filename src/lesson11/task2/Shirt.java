package lesson11.task2;

/**
 * Created by roman_v on 09.06.17.
 */
public class Shirt extends Clothes implements MenClothes, WomenClothes {

    public Shirt(int sizeClothes, double cost, String color) {
        super(sizeClothes, cost, color);
    }

    @Override
    public void clotheMan() {
        System.out.println("Футболка");
    }

    @Override
    public void clotheWomen() {
        System.out.println("Футболка");
    }
}
