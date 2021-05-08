package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String challenge = "Come on, you gotta try the challenge at least once.";
        System.out.println(challenge.replace("try", "attempt"));
        System.out.println("challenge = " + challenge);
        challenge = challenge.replace("try", "attempt");
        System.out.println("challenge = " + challenge);
        System.out.println(challenge.replace("on,", "on dude,").replace("once", "twice"));
        
        String sentence = "java is fun";
        String sentenceNoSpaces = sentence.replace(" ", "");
        System.out.println(sentenceNoSpaces);
        sentence = sentence.replace("java", "selenium")
                           .replace("fun", "a lot of fun");
        System.out.println("sentence = " + sentence);
    }
}
