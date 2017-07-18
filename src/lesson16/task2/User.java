package lesson16.task2;

/**
 * Created by roman_v on 18.07.17.
 */
public class User {
    private String logon;
    private String password;
    private Basket basket;

    public User(String logon, String password, Basket basket) {
        this.logon = logon;
        this.password = password;
        this.basket = basket;
    }

}
