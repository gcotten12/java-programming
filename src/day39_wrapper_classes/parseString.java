package day39_wrapper_classes;

public class parseString {
    public static void main(String[] args) {
        String age = "20";
        int ageOf = Integer.parseInt(age);
        System.out.println("ageOf = " + ageOf);

        String strPrice = "123";
        int price = Integer.parseInt(strPrice);
        if(price > 100) {
            System.out.println("expensive");
        }
        String sentence = "We wrote 100 lines of code";
        String[] arr = sentence.split(" ");
        int linesOfCode = Integer.parseInt(arr[2]);
        System.out.println(linesOfCode);
        linesOfCode = 400;
        System.out.println("linesOfCode = " + linesOfCode);

    }
}
