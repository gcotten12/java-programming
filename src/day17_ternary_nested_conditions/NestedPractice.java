package day17_ternary_nested_conditions;

public class NestedPractice {
    public static void main(String[] args) {
        String snackSelection = "chips", chipSelection = "doritos", cookieSelection = "oreos";
        if(snackSelection.equals("chips")) {
            if (chipSelection.equals("doritos")) {
                System.out.println("buy doritos");
            }else {
                System.out.println("buy hot fries");
            }
        }else if (snackSelection.equals("cookies")) {
            if (cookieSelection.equals("oreos"))
                System.out.println("buy oreos");
        }else {
            System.out.println("buy chips ahoy");
        }
    }
}
