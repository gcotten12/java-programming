package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        int count = word.length();
        System.out.println("count = " + count);
        System.out.println("There are "+count+" characters in the word "+word);
        System.out.println("wooden spoon".length());

        String name = "Garrett";
        if (name.length() == 7 && name.equals("Garrett")) {
            System.out.println("My name is spelled right");
        }else {
            System.out.println("That is not how you spell my name");
        }


    }
}
