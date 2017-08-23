package lesson25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookBd {
    private List<Book> books=new ArrayList<>();

    public BookBd() {
       books=Arrays.asList(new Book(52, "Horror", "Rich Hak", 520, Genre.FANTASTIC));
       books=Arrays.asList(new Book(89, "Killer", "Button Villok", 320, Genre.DETECTIVE));
       books=Arrays.asList(new Book(70, "Ant", "Tom Cruze", 326, Genre.CHILDRENS_LITERATURE));
       books=Arrays.asList(new Book(42, "Hobbits", "Lep Leprecon", 198, Genre.POEMS));
       books=Arrays.asList(new Book(38, "Last Blod", "Chak Noris", 1060, Genre.DISPLAYS));
       books=Arrays.asList(new Book(123, "Zombies are attacking", "Arnold Shvarceniger", 100, Genre.FANTASTIC));
       books=Arrays.asList(new Book(38, "Wind-stricken", "Van Damm", 436.20, Genre.CLASSIC));
       books=Arrays.asList(new Book(38, "Ninja Turtles", "Anna Ahmatova", 800.60, Genre.CHILDRENS_LITERATURE));
       books=Arrays.asList(new Book(38, "Japan", "Pavlo Zibrov", 50, Genre.POEMS));
    }




}
