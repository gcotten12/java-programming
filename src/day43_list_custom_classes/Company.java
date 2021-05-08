package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Garrett";
        emp1.jobTitle = "SDET";
        emp1.work();

        Employee emp2 = new Employee();
        emp2.name = "Zach";
        emp2.jobTitle = "Salesman";
        emp2.work();
    }
}
