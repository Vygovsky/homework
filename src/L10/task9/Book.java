package L10.task9;

/**
 * Created by Roman_v on 03.06.2017.
 */
public class Book implements Printable {
    private String name;

    @Override
    public void print() {
        System.out.println("Выводит книгу");
    }

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" +
            "name='" + name + '\'' +
            '}';
    }
}