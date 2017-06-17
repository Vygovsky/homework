package lesson10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Main {
    private static int apricot;

    public static void main(String[] args) {
        Fruit[] fruits = {
            new Apple(" Лигольд", 23),
            new Apple(" Белый налив", 13.50),
            new Apricot("Цунами", 55.30),
            new Apricot("Ледана", 56.90),
            new Pear("Вильямс", 70.50),
            new Pear("Велеса", 55)};

        System.out.println("Всего продано фруктов "+Fruit.getCount());
    }



    public static double applesTotalCost(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple)
                sum += fruit.cost();
        }
        return sum;
    }
    public static double apricotTotalCost(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Apricot)
                sum += fruit.cost();
        }
        return sum;
    }
    public static double pearTotalCost(Fruit[] fruits) {
        double sum = 0;
        for (Fruit fruit : fruits) {
            if (fruit instanceof Pear)
                sum += fruit.cost();
        }
        return sum;
    }
}

