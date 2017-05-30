package L7.task4;
import L7.task4.com.company.professions.Driver;
import L7.task4.com.company.detalis.Engine;
import L7.task4.com.company.vehicles.Car;

/**
 * Created by roman_v on 22.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X 50M", 2071);
        Engine engine = new Engine(575, "BMW M TWINPOWER TURBO В BMW X5 M");
        Driver driver = new Driver("Кольчин Николай Васьевич", 2.5);
        car.setD(driver);
        System.out.println(driver);
        car.setE(engine);
        System.out.println(engine);
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();
    }
}
