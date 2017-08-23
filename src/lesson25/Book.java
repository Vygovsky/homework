package lesson25;


import java.util.List;

public class Book {
    private int id;
    private String name;
    private String author;
    private double price;
    private Genre genres;


    public Book(int id, String name, String author, double price, Genre genres) {
        this.genres = genres;
        this.id = id;
        this.name = name;
        this.author=author;
        this.price = price;
    }

    //  public Book() {
  //  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Genre getGenres() {
        return genres;
    }

    public void setGenres(Genre genres) {
        this.genres = genres;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (Double.compare(book.price, price) != 0) return false;
        if (!name.equals(book.name)) return false;
        if (!author.equals(book.author)) return false;
        return genres.equals(book.genres);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + author.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + genres.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", genres=" + genres +
                '}';
    }
}
