package lesson12.task6;

import lesson12.task2.Seacher;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by roman_v on 20.06.17.
 */
public class DemoPalidrom {
    public static void main(String[] args) {
        String str = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        str=getNumb(str).trim();
        System.out.println(str);
        System.out.println();
        String[] numb = str.split("\\s+");
        for (String number : numb) {
            StringBuilder sb = new StringBuilder(number);
            sb.reverse();
            if (number.equals(sb.toString())) {
                System.out.println(number);
            }
        }
    }
    public static String getNumb(String str){
        String s= str.replaceAll("[A-Za-zА-Яа-я,.]","");
        return  s;
    }
}


