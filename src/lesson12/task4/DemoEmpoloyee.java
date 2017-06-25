package lesson12.task4;

/**
 * Created by UITS-Admin on 21.06.2017.
 */
public class DemoEmpoloyee {
    public static void main(String[] args) {


        Employee[] employees = {
                new Employee("Маркович Андрей Николаевич", 1500.0),
                new Employee("Маркович Андрей Николаевич", 1500.0),
                new Employee("Маркович Андрей Николаевич", 1500.0)
        };
        Report.generateReport(employees);
    }
}