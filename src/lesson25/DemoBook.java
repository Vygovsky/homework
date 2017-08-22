package lesson25;

import java.util.ArrayList;
import java.util.List;

public class DemoBook {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(52, "Horror", "Rich Hak", 520, Genre.FANTASTIC));
        books.add(new Book(89, "Killer", "Button Villok", 320, Genre.DETECTIVE));
        books.add(new Book(70, "Ant", "Tom Cruze", 326, Genre.CHILDRENS_LITERATURE));
        books.add(new Book(42, "Hobbits", "Lep Leprecon", 198, Genre.POEMS));
        books.add(new Book(38, "Last Blod", "Chak Noris", 1060, Genre.DISPLAYS));
        books.add(new Book(105, "Rembo", "Rich Ortis", 500, Genre.CLASSIC));

    }
}

