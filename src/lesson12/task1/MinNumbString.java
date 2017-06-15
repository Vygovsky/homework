package lesson12.task1;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by roman_v on 13.06.17.
 */
public class MinNumbString {
        public static void main(String[] args) {
            String l="Найти слово, в котором число различных символов минимально. ";

            Matcher m= Pattern.compile("[A-Za-zА-Яа-я0-9]+").matcher(l);
            Set<String> words=new LinkedHashSet<>();
            while (m.find()){
                words.add(l.substring(m.start(),m.end()));
            }
            print(words);
    }

    public static  void  print(Set <String> words){
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static void letter(Set <String> words){
        Map<String,Integer> map= new LinkedHashMap<>();
        Set<Character> letters=new HashSet<>();
        for (String word : words) {
            String s=word.toLowerCase();
            for (int i = 0; i <word.length(); i++) {
                letters.add(word.charAt(i));
            }
        }
    }
}