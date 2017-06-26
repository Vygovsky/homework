package lesson12.task1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by roman_v on 13.06.17.
 */
public class MinNumbString {
    public static void main(String[] args) {
        String l = "Найти слово, в котором число различных символов минимально.";
        Matcher m = Pattern.compile("[A-Za-zА-Яа-я0-9]+").matcher(l);
        Set<String> words = new LinkedHashSet<>();
        while (m.find()) {
            words.add(l.substring(m.start(), m.end()));
        }
        System.out.println(getWord(words));
    }

    public static void printInfo(Set<String> words) {
        for (String word : words) {
            System.out.println(word);
            System.out.print(getNumbChar(word));
        }
    }

    public static int getNumbChar(String word) {
        Set<Character> letters = new HashSet<>();
        String s = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }
        return letters.size();
    }

    public static String getWord(Set<String> words) {
        String res = " ";
        int charNumb = Integer.MAX_VALUE;
        for (String word : words) {
            int j = getNumbChar(word);
            if (j<charNumb) {
                res = word;
            }
        }
        return res;
    }
}


