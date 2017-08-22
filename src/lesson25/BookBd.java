package lesson25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookBd {
    private List<Book> books=new ArrayList<>();

    public BookBd() {
    }

    public BookBd (List<Book> books){

        books.add(new Book(Arrays.asList(new 52, "Horror", "Rich Hak", 520, Genre.FANTASTIC)));

    }

}
