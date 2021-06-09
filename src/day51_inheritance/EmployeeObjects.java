package day51_inheritance;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee jim = new Employee();
        jim.jobTitle = "Developer";
        double salary = jim.calculateSalary(50.00);
        System.out.println(jim);
        System.out.println("salary = " + salary);

        Contractor bill = new Contractor();
        bill.jobTitle = "SDET";
        double contractorSalary = bill.calculateSalary(60);
        System.out.println(bill);
        System.out.println("contractorSalary = " + contractorSalary);

    }

}
