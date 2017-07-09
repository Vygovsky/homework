package lesson15.task4;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Roman_v on 09.07.2017.
 */
public class StudentDemo {
    public static void main(String[] args) {
        List<Student>studentList=new LinkedList<>();

        studentList.add(new Student("Иванов",3,"hi"));
        studentList.add(new Student("Сидоров",3,"hi"));
        studentList.add(new Student("Тимошенко",3,"hi"));
        studentList.add(new Student("Порошенко",3,"hi"));
        studentList.add(new Student("Яценюк",3,"hi"));
        studentList.add(new Student("Парубий",3,"hi"));
        for (int i = 2; i < 100; i++) {
            studentList.add(new Student("Янукович" + i,3,"hi"));
        }
        for (Student student : studentList) {
           Teacher.formTabel(student,true);
        }
        printStudentList(studentList);
        System.out.println(studentList.size());
        Teacher.makeDecision(studentList);
        printStudentList(studentList);
        System.out.println(studentList.size());
    }

        public static void printStudentList( List<Student>studentList){
            for (Student student : studentList) {
                System.out.println(student);
            }
            System.out.println();
        }
}
