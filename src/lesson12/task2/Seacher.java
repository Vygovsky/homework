package lesson12.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Roman_v on 17.06.2017.
 */
public class Seacher {
    private static List<String> words=new ArrayList<>();

    public static List<String> getWords() {
        return words;
    }

    public static int numberOfWords() {
        return words.size();
    }

    public static List<String> words(String s, String regex) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while (m.find()){
            words.add(s.substring(m.start(), m.end()));
        }
        return words;
    }
}
