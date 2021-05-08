package day22_string_manipulation_continued;

public class DynamicSubString {
    public static void main(String[] args) {
        String phrase = "I enjoy coding";
        System.out.println(phrase.indexOf("c") + "\n" +
                phrase.substring(phrase.indexOf("c")));
        System.out.println("" + phrase.indexOf("e") + ", " + (phrase.indexOf("y") +1));
        System.out.println(phrase.substring(phrase.indexOf("e"), (phrase.indexOf("y") +1)));

    }
}
