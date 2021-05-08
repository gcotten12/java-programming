package day19_class_vs_object_strings;

public class ChackCaseMatch {
    public static void main(String[] args) {
        String countryCode = "USA";
        if (countryCode.equals(countryCode.toUpperCase())) {
            System.out.println("countryCode = " + countryCode);
        }
    }
}
