package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        String company = "cybertek";
        System.out.println("first letter: "+ company.charAt(0));
        char first = company.charAt(0);
        System.out.println("first = " + first);

        String word1 = "mom";
        if(word1.charAt(0) == word1.charAt(2)) {
            System.out.println("same");
        }else {
            System.out.println("not same");
        }
        int count = word1.length();
        char lastLetter =  word1.charAt(count - 1);
        System.out.println("lastLetter = " + lastLetter);
    }
}
