package lesson25;

public class DemoBook {
    public static void main(String[] args) {
        BookBd bookBd = new BookBd();
        bookBd.addBook(new Book(20, "Tresh", "Emanuil Kant", 503, Genre.FANTASTIC));
        bookBd.addBook(new Book(29, "C++", "Petrykin Sesrgey", 1500, Genre.CHILDRENS_LITERATURE));
        bookBd.addBook(new Book(15, "Java Core", "Ryndich Ludmila", 53, Genre.POEMS));

        bookBd.removeBook(new Book(123, "Zombies are attacking", "Arnold Shvarceniger", 100, Genre.FANTASTIC));

        bookBd.fillBook(new Book(), new Book(), new Book(), new Book());

        for (BookBd bb : bookBd) {
            System.out.println(bb);

        }
        bookBd.removeAllBook();

    }
}

