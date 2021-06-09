package day51_inheritance;

public class Employee {
    String jobTitle;
    public double calculateSalary(double hourlyRate) {
        double salary = hourlyRate * 2080;
        double bonus = salary/10;
        salary += bonus;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
