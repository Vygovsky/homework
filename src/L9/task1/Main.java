package L9.task1;

import L8.flowers.Flower;

/**
 * Created by Roman_v on 05.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Flower[] buket1={
            new Tulpan("Желтый тюльпан", Tulpan.Brand.YELLOW),
            new Tulpan("Красный тюльпан", Tulpan.Brand.RED),
            new Tulpan("Розовый тюльпан", Tulpan.Brand.PINK)
        };

        double buketCost=0;
        for (Flower flower : buket1) {
            buketCost+=flower.cost();
        }
        System.out.println("Стоимость букета "+buketCost);

        // создать  другие букеты
    }




}
