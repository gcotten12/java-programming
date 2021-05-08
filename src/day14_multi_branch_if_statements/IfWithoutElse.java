package day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2021;
        if (year == 2020) {
            System.out.println("Covid19 pandemic year");
            System.out.println("Wear mask and keep distance");
        }

        String country = "USA";
        if (country.equals("USA")) {
            System.out.println("Americaaaaa");
        }
        System.out.println("Welcome to the "+country);
    }
}
