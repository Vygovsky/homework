package lesson12.task3;

/**
 * Created by Roman_v on 15.06.2017.
 */
public class SubString {
    public static void main(String[] args) {
        String s = new String("No description, website, or topics provided");
        int start = s.length() / 2 - 1;
        int end = start + 2;
        System.out.println(s.substring(start, end));
    }
}

