package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String name = "";
        System.out.println(name.isEmpty());

        if("".equals(name)) {
            System.out.println("Garrett");

            String veggie = "carrots";
            System.out.println(veggie.isEmpty());
            //if veggie IS NOT EMPTY, print we have carrots
            if(!veggie.isEmpty()) {
                System.out.println("we have carrots");
            }
            String firstName = "Garrett";
            if(firstName.contains("a") && firstName.contains("t")) {
                System.out.println(firstName+" has an 'a' and a 'e'");
            }else {
                System.out.println("wrong name");
            }
        }
    }
}
