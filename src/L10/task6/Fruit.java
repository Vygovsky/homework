package L10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public abstract class Fruit {
    private String name;
    private static double count;

    public Fruit(String name) {
        this.name = name;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    public static  double getCount(){
        return count;
    }
    public abstract double cost();
}


   /* Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
    Класс Фрукт содержит завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
    и метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
    Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов.
    А также общую стоимость отдельно проданных яблок, груш и абрикос (используем статические переменные, методы).
    */