package day51_inheritance;

public class Contractor extends Employee {
    public double calculateSalary(double hourlyRate) {
        double salary = hourlyRate * 2000;
        return salary;
    }

    @Override
    public String toString() {
        return "Contractor{jobTitle=" + "\'" +
                jobTitle + "\'"
                + "}";
    }
}
