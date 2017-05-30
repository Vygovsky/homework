package L7.task4;

import L7.task4.com.company.lorry.Lorry;
import L7.task4.com.company.professions.Driver;
import L7.task4.com.company.detalis.Engine;
import L7.task4.com.company.sportcar.SportCar;
import L7.task4.com.company.vehicles.Car;

/**
 * Created by roman_v on 22.05.17.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X 50M", 2071);
        Engine engine = new Engine(575, "BMW M TWINPOWER TURBO В BMW X5 M");
        Driver driver = new Driver("Кольчин Николай Васьевич", 2.5);
        Lorry lorry = new Lorry("Renault", "MAGNUM", 19000, 30000);
        Driver driver1 = new Driver("Фаат Андрей Петрович", 5);
        Engine engine1 = new Engine(480, "DXi 12");
        SportCar sportCar = new SportCar("Chevrolet Corvette", "Stingray", 1539, 301);
        Driver driver2 = new Driver("Фернандо Алонсо", 20);
        car.setD(driver1);
        car.setE(engine);
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();
    }
}
