package lesson12.task4;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Created by UITS-Admin on 21.06.2017.
 */
public class DemoEmpoloyee {
    public static void main(String[] args) throws UnsupportedEncodingException {

        Employee[] employees = {
                new Employee("Маркович Андрей Николаевич", 1500.0 / 21, new Date()),
                new Employee("Марк Андрей Николаевич", 1800.0 / 21, new Date()),
                new Employee("Ромбик Андрей Николаевич", 2000.0 / 21, new Date())};
        FullReport.generateReport(employees);

    }

}
