package lesson12.task4;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

/**
 * Created by roman_v on 26.06.17.
 */
public class FullReport extends Report {
    public static void generateReport(Employee[] employees) {
        NumberFormat nf=NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        DateFormat fd=DateFormat.getDateInstance(DateFormat.SHORT);

        System.out.printf("%-30S    %-10S    %S\n", "Имя",  "зарплата", "дата ");
        for (Employee employee : employees) {
            System.out.printf("%-30s    %-10s    %s\n", employee.getFullName(), nf.format(employee.getSalary()), fd.format(employee.getSalaryDate()));
        }

        }
    }


