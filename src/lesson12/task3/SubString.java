package lesson12.task3;

/**
 * Created by Roman_v on 15.06.2017.
 */
public class SubString {
    public static void main(String[] args) {
        String s = new String("No description, website, or topics provided.");
        String s1 = "Опубликовано";
        System.out.println(getRpo(s));
        System.out.println(getRpo(s1));
    }

    public static String getRpo(String s) {
        int start = s.length() / 2 - 1;
        int end = start + 2;
        return (s.substring(start, end));
    }
}

