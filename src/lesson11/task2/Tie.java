package lesson11.task2;

/**
 * Created by roman_v on 09.06.17.
 */
public class Tie extends Clothes implements MenClothes {
    public Tie(int sizeClothes, double cost, String color) {
        super(sizeClothes, cost, color);
    }

    @Override
    public void clotheMan() {
        System.out.println("Галстук");
    }
}
