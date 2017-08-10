package lesson16.task2;

import lesson11.task2.Size;

public class Test {
    public static void main(String[] args) {
        Basket basket=new Basket();
        basket.addGoods(new Good(1,"Футболка", Size.M),5);
        basket.addGoods(new Good(2,"Шорта", Size.S),6);
        basket.serialize("1.ser");
        Basket basket1=new Basket();
        basket1.deserialize("1.ser");
        System.out.println(basket1);
    }
}
