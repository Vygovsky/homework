package lesson12.task4;

import java.util.Date;

/**
 * Created by Roman_v on 15.06.2017.
 */
public class Report {
    public static void generateReport(Employee[] employees) {
        System.out.printf("%-30s    %-10s    %s\n", "Имя", "зарплата", "дата ");
        for (Employee employee : employees) {
            System.out.printf("%-30s    %-10s    %s %4$tB %4$td, %4$tY\n", employee.getFullName(), employee.getSalary(), "Дата:", new Date());
        }
    }
}