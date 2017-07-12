package lesson16.task1;

/**
 * Created by roman_v on 12.07.17.
 */

public class WrongLoginException extends Exception {
    private String message;

    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String toString() {
        return "WrongLoginException{" + "message='" + message + '\'' + '}';
    }
}
