package day29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "java";
        for(int i = 0; i < word.length(); i++) {
            char outerChar = word.charAt(i);
            int count = 0;
            for(int j = 0; j < word.length(); j++) {
                char innerChar = word.charAt(j);
                if(outerChar == innerChar) {
                    count++;
                }
            }
            System.out.println(outerChar + ":" + count);
        }
    }
}
