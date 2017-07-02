package lesson12.task4;

import java.util.Date;

/**
 * Created by UITS-Admin on 21.06.2017.
 */
public class DemoEmpoloyee {
    public static void main(String[] args) {
        Employee[]employees={
            new Employee("Маркович Андрей Николаевич",1500.0/27, new Date()),
            new Employee("Марк Андрей Николаевич",1500.0/51, new Date()),
            new Employee("Ма Андрей Николаевич",1500.0/87, new Date())
        };
        FullReport.generateReport(employees);
    }
}
