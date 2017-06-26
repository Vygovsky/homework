package lesson12.task4;

import java.util.Date;

/**
 * Created by Roman_v on 15.06.2017.
 */
public class Employee {
    private String fullName;
    private double salary;
    private Date salaryDate;

    public Employee(String fullName, double salary) {
        this.fullName = fullName;
        this.salary = salary;
        this.salaryDate=salaryDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public Date getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(Date salaryDate) {
        this.salaryDate = salaryDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}
