package lesson25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class BookBd {
    private List<Book> books;

    public BookBd() {
        books = Arrays.asList(new Book(52, "Horror", "Rich Hak", 520, Genre.FANTASTIC),
                new Book(89, "Killer", "Button Villok", 320, Genre.DETECTIVE),
                new Book(70, "Ant", "Tom Cruze", 326, Genre.CHILDRENS_LITERATURE),
                new Book(42, "Hobbits", "Lep Leprecon", 198, Genre.POEMS),
                new Book(38, "Last Blod", "Chak Noris", 1060, Genre.DISPLAYS),
                new Book(123, "Zombies are attacking", "Arnold Shvarceniger", 100, Genre.FANTASTIC),
                new Book(38, "Wind-stricken", "Van Damm", 436.20, Genre.CLASSIC),
                new Book(38, "Ninja Turtles", "Anna Ahmatova", 800.60, Genre.CHILDRENS_LITERATURE),
                new Book(38, "Japan", "Pavlo Zibrov", 50, Genre.POEMS));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);

    }
    public void addManyBook(Book ... book){

    }
    public void removeSeveralBook(){
        Iterator<Book> bookIterator=books.iterator();
        while (bookIterator.hasNext()){
           books.remove(books.iterator().next());
        }
    }


}
