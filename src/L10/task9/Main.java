package L10.task9;

/**
 * Created by Roman_v on 03.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        Printable[] p = new Printable[4];
        p[0] = new Book("Вор в законе");
        p[1] = new Book("Месть братвы");
        p[2] = new Magazine("Инфо-криминал");
        p[3] = new Magazine("Божья коровка");
        for (Printable printable : p) {
            printable.print();
        }
    }
}