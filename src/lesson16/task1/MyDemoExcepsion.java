package lesson16.task1;

/**
 * Created by roman_v on 12.07.17.
 */
public class MyDemoExcepsion {
    public static void main(String[] args) {
        validate("kolkin", "12598", "12598");
        validate("LuDok-hoLLodok", "ttyyu", "ttyyu");
        validate("Boris.UR", "229llo", "ttt");
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
