package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(repeatString("java", 3, "|"));
        System.out.println(repeatString("hello", 4, '/'));

    }

    public static String repeatString(String word, int times, String delimiter) {
        String[] words = new String[times];
        for (int i = 0; i < words.length; i++) {
            words[i] = word;
        }
        return String.join(delimiter, words);
    }

    public static String repeatString(String word, int times, char delimeter) {
        String repeatValues = "";
        for (int i = 1; i <= times; i++) {
            if (i == times) { // if last iteration
                repeatValues += word;
            } else {
                repeatValues += word + delimeter;
            }
        }
        return repeatValues;
    }
}
