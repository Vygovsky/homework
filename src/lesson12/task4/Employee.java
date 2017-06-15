package lesson12.task4;

/**
 * Created by Roman_v on 15.06.2017.
 */
public class Employee {
    private String fullName;
    private String salary;

    public Employee(String fullName, String salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}
