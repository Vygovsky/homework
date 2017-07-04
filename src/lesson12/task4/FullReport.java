package lesson12.task4;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by roman_v on 26.06.17.
 */
public class FullReport extends Report {
    private static void printInfo(String country, String language) throws UnsupportedEncodingException {
        Locale locale = new Locale(country, language);
        ResourceBundle rb = ResourceBundle.getBundle("text", locale);
        String s = rb.getString("text4");
        s = new String(s.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(s);
    }

    public static void generateReport(Employee[] employees) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        DateFormat fd = DateFormat.getDateInstance(DateFormat.SHORT);

        System.out.printf("%-30S    %-10S    %S\n", "Имя", "зарплата", "дата ");
        for (Employee employee : employees) {
            System.out.printf("%-30s    %-10s    %s\n", employee.getFullName(), nf.format(employee.getSalary()), fd.format(employee.getSalaryDate()));
        }
    }
}


