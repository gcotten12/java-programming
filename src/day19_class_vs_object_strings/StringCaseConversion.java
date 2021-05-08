package day19_class_vs_object_strings;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Cybertek";
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("Java".toLowerCase());

        word.toLowerCase();
        System.out.println(word);
        
        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        company = company.toUpperCase();
        System.out.println(company);
        company = company.toLowerCase();
        System.out.println(company);

        System.out.println(word.substring(0,3).contains("c"));
    }
}
