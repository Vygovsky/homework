package L10.task1;

        /**
 * Created by roman_v on 02.06.17.
 */
public class Main {
    public static void main(String[] args) {
        Shape[] figura = {
                new Circle(3, 6, 5),
                new Rectangle(2, 6, 10, 3)};
        for (Shape shape : figura) {
        }
        figura[0].toString();
        figura[1].getColor();

    }

}

