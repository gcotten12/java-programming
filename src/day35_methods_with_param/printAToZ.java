package day35_methods_with_param;

public class printAToZ {
    public static void main(String[] args) {
        printAToZ();
        displayUsFlag();
    }
    public static void printAToZ() {
        for(char i = 'A'; i <= 'Z';i++) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
    public static void displayUsFlag() {
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println(" * * * * *  ==================================");
        System.out.println("* * * * * * ==================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("==============================================");
    }
}
