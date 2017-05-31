package L8.task4.horse;

import L8.task4.animals.Animals;

/**
 * Created by roman_v on 31.05.17.
 */
public class Horse extends Animals {
    private String name;
    private double carrying;

    public Horse(String location, String food, int ages, double whight, String name, double carrying) {
        super(location, food, ages, whight);
        this.name = name;
        this.carrying = carrying;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCarrying() {
        return carrying;
    }

    public void setCarrying(double carrying) {
        this.carrying = carrying;
    }

    @Override
    public void makeNoise() {
        System.out.println("Ржет");
    }

    @Override
    public void toEat() {
        System.out.println(getFood());
    }
}



