package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Package Handler";
        String company = "Fedex";
        String jobDescription = "you will be on the preload shift, loading package cars.";
        double salary = 300;
        String yearsExp = "No experience required";
        String hasBenefits = "yes";

        System.out.println(title);
        System.out.println(company);
        System.out.println("As a package handler " + jobDescription);
        System.out.println("You will be paid weekly: $" + salary);
        System.out.println(yearsExp);
        System.out.println(hasBenefits + ", many benefits are offered such as tuition assistance, health, eye, and dental insurance are also provided after 9 months");


    }
}
