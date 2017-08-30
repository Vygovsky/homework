package lesson25;

public class DemoBook {
    public static void main(String[] args) {
        BookBd bookBd = new BookBd();
        bookBd.addBook(new Book(20, "Tresh", "Emanuil Kant", 503, Genre.FANTASTIC));
        bookBd.addBook(new Book(29, "C++", "Petrykin Sesrgey", 1500, Genre.CHILDRENS_LITERATURE));
        bookBd.addBook(new Book(15, "Java Core", "Ryndich Ludmila", 53, Genre.POEMS));

        bookBd.removeBook(new Book(123, "Zombies are attacking", "Arnold Shvarceniger", 100, Genre.FANTASTIC));

        bookBd.fillBook(
                new Book(23,"Mounth","Adronov",259.60,Genre.POEMS),
                new Book(),
                new Book(),
                new Book());

        bookBd.update(20,600);
        bookBd.printInfo();
        bookBd.serialize("BD.ser");
        BookBd bookBd1=new BookBd();
        bookBd1.deserialize("BD.ser");
        System.out.println(bookBd1);



        bookBd.removeAllBook();
        System.out.println(bookBd);

    }
}

