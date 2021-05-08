package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        String itemName = "candy";
        boolean onSale = true, freeShipping = true;
        if(onSale && freeShipping) {
            System.out.println("I will by the "+itemName);
        }else {
            System.out.println("I will not buy "+itemName);
        }
        //if statement with itemName included
        if(onSale && freeShipping && itemName.equals("candy")) {
            System.out.println("I will by the "+itemName);
        }else {
            System.out.println("I will not buy "+itemName);
        }


    }
}
