package lesson8.task4.dog;

import lesson8.task4.animals.Animal;

/**
 * Created by roman_v on 31.05.17.
 */
public class Dog extends Animal {
    private String name;
    private double biteForce;

    public Dog(String location, String food, int ages, double whight, String name, double biteForce) {
        super(location, food, ages, whight);
        this.name = name;
        this.biteForce = biteForce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBiteForce() {
        return biteForce;
    }

    public void setBiteForce(double biteForce) {
        this.biteForce = biteForce;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лает");
    }

    @Override
    public void toEat() {
        System.out.println(getFood());
    }
}