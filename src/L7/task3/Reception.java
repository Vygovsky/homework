package L7.task3;

public class Reception {
    public static void main(String[] args) {
        User usre = new User(" Раков Артем Иванович", "01/01/1998");
        usre.setPhone(123246546);
        usre.setFacultet("КН");
        usre.setIdCard(213);
        usre.takeBook(new Book("Букварь"));

    }


}
