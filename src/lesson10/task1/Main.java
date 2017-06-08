package lesson10.task1;

/**
 * Created by roman_v on 02.06.17.
 */
public class Main {
    public static void main(String[] args) {
        Shape[] figura = {
                new Circle(3, 6, 5),
                new Rectangle(2, 6, 10, 3)};
        for (Shape shape : figura) {
            if (shape instanceof Circle) {
                System.out.println("Выводим площадь круга: " + shape.area());
            } else {
                if (shape instanceof Rectangle) {
                    System.out.println("Выводим площадь прямоугольника: " + shape.area());
                }
            }
            shape.draw();
        }
    }
}
