package lesson15.task1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by UITS-Admin on 05.07.2017.
 */
public class UnicNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNext()){
            String[] numbers = sc.nextLine().split("[\\s,]+");
            Set<String> num=new HashSet<>();
            for (String number : numbers) {
                num.add(number);
            }
            for (String s : num) {
                System.out.print(s+" ");
            }
        }

    }
}
