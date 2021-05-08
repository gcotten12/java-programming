package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        System.out.println(letters);


        for(char each : letters) {
            System.out.print(each);
        }


        String sentence = new String(letters);
        System.out.println("\n"+ sentence);

        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        System.out.println(itemArray);

        System.out.println("itemArray: " + itemArray.length); // In Array, length becomes a variable

        String[] fruits = {"bananas", "apples", "kiwi", "mango", "papaya", "strawberry"};

        // "bananas"-"apples"-"kiwi"-"mango"-"papaya"-"strawberry"
        String fruitStr = "";
        for(String values : fruits) {
            fruitStr += values + "-";
        }
        System.out.println("fruitStr = " + fruitStr);


        String[] languages = {"java", "python", "c++", "sql", "ruby", "javascript"};

        System.out.println(String.join("|",languages));


    }
}
