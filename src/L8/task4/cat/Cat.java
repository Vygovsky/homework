package L8.task4.cat;

import L8.task4.animals.Animals;

/**
 * Created by roman_v on 31.05.17.
 */
public class Cat extends Animals {
    private String name;
    private int lives;

    public Cat(String location, String food, int ages, double whight, String name, int lives) {
        super(location, food, ages, whight);
        this.name = name;
        this.lives = lives;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяукает");
    }

    @Override
    public void toEat() {
        System.out.println(getFood());
    }
}
