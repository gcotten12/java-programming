package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        counters(5);
        counters(7);
        counters(2);
        String name = "Garrett";
        counters(name.length());
    }
    public static void counters(int num) {
        for(int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
