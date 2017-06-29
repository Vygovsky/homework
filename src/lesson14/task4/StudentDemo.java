package lesson14.task4;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by roman_v on 29.06.17.
 */
public class StudentDemo {
    public static void main(String[] args) {
        List<Stusent>stud=new LinkedList<>();
        stud.add(new Stusent("Пертов Илья Абрамович", 3));
        stud.add(new Stusent("Иванов Иван Петрович", 4));
        stud.add(new Stusent("Сидоров Илья Алексеевич", 2));
        stud.add(new Stusent("Ломакина Юлия Владимировна", 5));
        stud.add(new Stusent("Гунько Марина Романовна", 1));
        stud.add(new Stusent("Суркис Маским Петрович", 2));

        for (Stusent stusent : stud) {
            
        }
    }
}
