package day22_string_manipulation_continued;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.print(word.charAt(3));
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.print(word.charAt(0));
        //print using single statement
        System.out.println();
        System.out.println("" +
        word.charAt(3) + word.charAt(2) +
        word.charAt(1) + word.charAt(0));

        //assign reverse word to reverseWord
        String reverseWord = ("" +
                word.charAt(3) + word.charAt(2) +
                word.charAt(1) + word.charAt(0));
        System.out.println("reverseWord = " + reverseWord);

        //check if word is palindrome
        if(reverseWord.equalsIgnoreCase("java")) {
            System.out.println("is palindrome");
        }else{
            System.out.println("not palindrome");
        }
        

    }
}
