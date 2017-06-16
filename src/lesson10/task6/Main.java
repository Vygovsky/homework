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

    }

    public static double pirntInfoApple(Fruit[] apple) {
        double sum = 0;
        for (Fruit x : fruits) {
            sum += x.cost();
            System.out.println("Стоимость яблок " + sum);
        }



       public static double printInfoApricot(Fruit[] apricot) {
        double apricCost = 0;
        for (Fruit fruits : apricot) {
            apricCost += fruits.cost();
            System.out.println("Стоимоть абрикос " + apricCost);
        }
       }

        public static double printInfoPear(){

        }
           pearCost = 0;
           for (Pear fruit : pear) {
            pearCost += fruit.cost();
        }
        System.out.println("Стоимость груш " + pearCost);


        for (Fruit fruit : fruits) {
            getCount += fruit.cost();
        }
        System.out.println("Стоимость всех фруктов " + getCount);
    }

}

