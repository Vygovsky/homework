package L10.task6;

/**
 * Created by Roman_v on 05.06.2017.
 */
public abstract class Fruit {
    private String sortName;
    private  double cost;

    public Fruit(String sortName, double cost) {
        this.sortName = sortName;
        this.cost = cost;
    }

    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    void printManufacturerInfo() {
        System.out.println("Made in Ukraine");
    }

    public abstract double cost();

    public double getCost() {
        return cost;
    }
}


   /* Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
    Класс Фрукт содержит завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
    и метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
    Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов.
    А также общую стоимость отдельно проданных яблок, груш и абрикос (используем статические переменные, методы).
    */