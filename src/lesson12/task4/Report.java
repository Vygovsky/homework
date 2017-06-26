package lesson12.task4;

/**
 * Created by Roman_v on 15.06.2017.
 */
public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            String[] fullName = employee.getFullName().split("\\s+");
            System.out.printf(employee.getFullName());


        }


    }

}


