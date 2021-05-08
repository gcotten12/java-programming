package day28_loops;

public class FindUniqueChars {
    public static void main(String[] args) {
        String word = "javva";
        String unique = "";

        for(int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if(!unique.contains(letter + "")) {
                unique += letter;
            }

        }
        System.out.println("unique = " + unique);
    }
}
