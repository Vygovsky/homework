package L7.task3;

public class Reception {
    public static void main(String[] args) {
        User usre = new User(" Раков Артем Иванович", "01/01/1998");
        usre.setPhone(8096 - 557 - 555 - 55);
        usre.setFacultet("КН");
        usre.setIdCard(229);
        usre.takeBook(new Book("Букварь"));
        usre.returnBook(new Book("Математика 5 класс"));
    }
}
