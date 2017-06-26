package lesson12.task4;

import java.util.Date;

/**
 * Created by Roman_v on 15.06.2017.
 */
public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("Имя Зарплата Дата", "+8", "+8","+8");
        System.out.println();
        for (Employee employee : employees) {
            System.out.printf("%s    %s    ", employee.getFullName(), employee.getSalary());
            System.out.printf("%1$s %2$tB %2$td, %2$tY\n", "Дата:", new Date());
        }
    }
}

