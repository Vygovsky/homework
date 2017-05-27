package L7.task4;
import L7.task4.com.company.details.Driver;
import L7.task4.com.company.professions.Engine;
import L7.task4.com.company.vehicles.Car;
/**
 * Created by roman_v on 22.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X 50M", 2071);
        Engine engine = new Engine(575, "BMW M TWINPOWER TURBO В BMW X5 M");
        Driver driver=new Driver("Кольчин Николай Васьевич",2.5);
        System.out.println(car);
        System.out.println(engine);
        System.out.println(driver);
        car.start();
        car.setD();
        car.setE();
        car.stop();
        car.turnLeft();
        car.turnRight();
    }
}
