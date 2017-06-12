package lesson10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Apple[] apple = {new Apple(" Лигольд", 23), new Apple(" Белый налив", 13.50), new Apple(" Декоста", 15.20), new Apple(" Ченный принц", 21.20),};
        double appleCost = 0;
        for (Apple fruit : apple) {
            appleCost += fruit.cost();
        }
        System.out.println("Стоимость яблок " + appleCost);

        Apricot[] apricot = {new Apricot("Цунами", 55.30), new Apricot("Ледана", 56.90), new Apricot("Робада", 60), new Apricot("Киото", 60.25)};
        double apricCost = 0;
        for (Apricot fruit : apricot) {
            apricCost += fruit.cost();
        }
        System.out.println("Стоимоть абрикос " + apricCost);

        Pear[] pear = {new Pear("Бере боск", 66), new Pear("Вильямс", 70.50), new Pear("Велеса", 55)};
        double pearCost = 0;
        for (Pear fruit : pear) {
            pearCost += fruit.cost();
        }
        System.out.println("Стоимость груш "+pearCost);

      //  System.out.println("Стоимость всех проданных фруктов "+fruit.getCount);
    }
}
