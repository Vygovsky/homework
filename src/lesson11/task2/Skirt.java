package lesson11.task2;

/**
 * Created by roman_v on 09.06.17.
 */
public class Skirt extends Clothes implements WomenClothes {
    public Skirt(int sizeClothes, double cost, String color) {
        super(sizeClothes, cost, color);
    }

    @Override
    public void clotheWomen() {
        System.out.println("Юбка");
    }
}
