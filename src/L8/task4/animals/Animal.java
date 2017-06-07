package L8.task4.animals;

/**
 * Created by roman_v on 31.05.17.
 */
public class Animal {
    private  String location;
    private  String food;
    private int ages;
    private double weight;

    public void  makeNoise(){
        System.out.println(" Шум");
    }
    public void toEat(){
        System.out.println("Еда");
    }
    public void sleep(){
        System.out.println("Сон");
    }

    public Animal(String location, String food, int ages, double whight) {
        this.location = location;
        this.food = food;
        this.ages = ages;
        this.weight = whight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getAges() {
        return ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
