package lesson16.task2.entity;

import lesson16.task1.WrongLoginException;
import lesson16.task1.WrongPasswordExep;
import lesson16.task2.entity.Basket;

/**
 * Created by roman_v on 18.07.17.
 */
public class User {
    private int id;
    private String logon;
    private String password;
    private Basket basket;

    public User(String logon, String password, Basket basket) {
        this.logon = logon;
        this.password = password;
        this.basket = basket;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogon() {
        return logon;
    }

    public void setLogon(String logon) {
        this.logon = logon;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public static void validate(String login, String password, String confirm) {
        try {
            if (login.length() > 20) {
                System.out.println("Login");
                throw new WrongLoginException("Вызов ошибки логина");
            } else if (password.length() > 20) {
                throw new WrongPasswordExep("Вызов ошибки пароля");
            }
            if (password.equals(confirm)) {
                System.out.println("Пароль подтвержден");
            } else {
                System.out.println("Не верный логин или пароль");
            }
        } catch (WrongLoginException | WrongPasswordExep e) {
            System.out.println(e.getMessage());
            System.out.println("!!!Не верный логин или пароль");

        } finally {
            System.out.println(login + " " + password + " " + confirm);
        }
    }
}

