package lesson16.task1;

/**
 * Created by roman_v on 12.07.17.
 */
public class WrongPasswordExep extends Throwable {
    private String message;

    public WrongPasswordExep(String message) {
        super(message);
        this.message = message;
    }

    public WrongPasswordExep() {
    }

    @Override
    public String toString() {
        return "WrongPasExap{" + "message='" + message + '\'' + '}';
    }
}

