package day16_switch_ternary;

public class AdaireApartment {
    public static void main(String[] args) {
        System.out.println("#### WELCOME TO ADAIRE APARTMENTS ####");
        int numberOfBedrooms = 0;
        int startingPrice = 0;

        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment slected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartment slected");
                startingPrice = 1725;
            case 2:
                System.out.println("Two bedroom apartment slected");
                startingPrice = 2899;
            default:
                System.out.println("Three bedroom apartment currently unavailable");
        }
        System.out.println("Starting price: $"+startingPrice);

        int a = 5;

        switch (a) {
            case 6:
                System.out.println("b");
            case 5:
                System.out.println("a");
            case 4:
                System.out.println("c");
            default:
                System.out.println("d");

                float num = 12_345;
                float num2 = num + 1234;
                System.out.println(num2);

        }
    }
}
