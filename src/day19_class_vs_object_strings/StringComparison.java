package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Dallas";
        //equals() method - Case Sensitive Comparison
        System.out.println(city.equals("Dallas"));
        System.out.println(city.equals("dallas"));
        System.out.println(city.equals("Dallas "));
        //equalsIgnoreCase() method - NOT Case Sensitive
        System.out.println(city.equalsIgnoreCase("dallas"));
        System.out.println(city.equalsIgnoreCase("DALLAS"));
        System.out.println(city.equalsIgnoreCase("DALLAS "));

        if (city.equals("DALLAS")) {
            System.out.println("equals() true");
        }else {
            System.out.println("equals() false");
        }
    }
}
