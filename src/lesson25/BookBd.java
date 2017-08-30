package lesson25;

import java.io.*;
import java.util.*;

public class BookBd implements Serializable {
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public BookBd() {
        books = new ArrayList<>(Arrays.asList(new Book(52, "Horror", "Rich Hak", 520, Genre.FANTASTIC),
                new Book(89, "Killer", "Button Villok", 320, Genre.DETECTIVE),
                new Book(70, "Ant", "Tom Cruze", 326, Genre.CHILDRENS_LITERATURE),
                new Book(42, "Hobbits", "Lep Leprecon", 198, Genre.POEMS),
                new Book(38, "Last Blood", "Chak Noris", 1060, Genre.DISPLAYS),
                new Book(123, "Zombies are attacking", "Arnold Shvarceniger", 100, Genre.FANTASTIC),
                new Book(38, "Wind-stricken", "Van Damm", 436.20, Genre.CLASSIC),
                new Book(38, "Ninja Turtles", "Anna Ahmatova", 800.60, Genre.CHILDRENS_LITERATURE),
                new Book(38, "Japan", "Pavlo Zibrov", 50, Genre.POEMS)));
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);

    }

    public void removeAllBook() {
        books.clear();
    }

    public void fillBook(Book... books) {
        for (Book book : books) {
            addBook(book);
        }
    }

    public void printInfo() {
        for (Book book:books) {
            System.out.println(book);
        }
    }

    public void update(int id, double price) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {

            Book book = iterator.next();
            if (book.getId() == id) {
                book.setPrice(price);
            }
        }
    }
    public void serialize(String fileName) {
        try (FileOutputStream fs = new FileOutputStream(fileName);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(this);
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void deserialize(String fileName){
        try (FileInputStream fis = new FileInputStream(fileName);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            this.setBooks(((BookBd)ois.readObject()).getBooks());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookBd bookBd = (BookBd) o;

        return books.equals(bookBd.books);
    }

    @Override
    public int hashCode() {
        return books.hashCode();
    }

    @Override
    public String toString() {
        return "BookBd{" +
                "books=" + books +
                '}';
    }
}
