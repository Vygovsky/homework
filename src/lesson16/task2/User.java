package lesson16.task2;

import lesson16.task1.WrongLoginException;
import lesson16.task1.WrongPasswordExep;

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
    }

    private static void validate(String login, String password, String confirm) {
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
            System.out.println("Не верный логин или пароль");

        } finally {
            System.out.println(login + " " + password + " " + confirm);
        }
    }
}

