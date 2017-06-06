package L10.task11;

/**
 * Created by roman_v on 06.06.17.
 */
public abstract class Fruit {
    private double cost;

    public Fruit(double cost) {
        this.cost = cost;
    }

    void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    public abstract double cost();
}
/* Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
    Класс Фрукт содержит завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
    и метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
    Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов.
    А также общую стоимость отдельно проданных яблок, груш и абрикос (используем статические переменные, методы).
    */