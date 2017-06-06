package L10.task11;

/**
 * Created by roman_v on 06.06.17.
 */
public class Apple extends Fruit {
  private String nameSort;

    public Apple( String nameSort,double cost) {
        super(cost);
        this.nameSort = nameSort;
    }

    public String getNameSort() {
        return nameSort;
    }

    public void setNameSort(String nameSort) {
        this.nameSort = nameSort;
    }

    @Override
    public double cost() {
        return 0;
    }
}
/* Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
    Класс Фрукт содержит завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
    и метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
    Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов.
    А также общую стоимость отдельно проданных яблок, груш и абрикос (используем статические переменные, методы).
    */