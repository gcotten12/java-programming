package OfficeHours.day_4_7_21;

public class PrimeInRange {
    public static void main(String[] args) {
        // Print Prime Numbers
        int num = 50;
        String primeNumbers = "";
        System.out.println("----- Prime Numbers -----");

        for(int i = 2; i <= num; i++) {
            boolean isPrime = true;

            for(int n = 2; n < i; n++) {

                if(i % n == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(i+ " ");
            }
        }



    }
}
