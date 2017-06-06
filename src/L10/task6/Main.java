package L10.task6;
/**
 * Created by Roman_v on 05.06.2017.
 */
public class Main {
    public static void main(String[] args) {
      Apple[] apple={
                new Apple(" Лигольд",23),
                new Apple(" Белый налив",13.50),
                new Apple(" Декоста",15.20),
                new Apple(" Ченный принц",21.20),
        };
        double appleCost=0;
        for (Apple fruit : apple) {
            appleCost+=fruit.cost();
        }
        System.out.println("Стоимость яблок "+appleCost);

    }
}
