package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania", "Portugal", "Philippines", "Armenia", "Colombia", "Honduras", "Indonesia", "United States", "Russia"};

        System.out.println("---- prices more than 100 ----");
        for (double eachPrice : prices) {
            if (eachPrice >= 100.0) {
                System.out.print(eachPrice + " ");
            }
        }

        System.out.println("\n---- prices between 10 and 70 inclusive ----");
        for (double between10and70 : prices) {
            if (between10and70 >= 10.0 && between10and70 <= 70.0) {
                System.out.print(between10and70 + " ");
            }
        }

        System.out.println("\n---- count of prices that are greater than 50 ----");
        int count = 0;
        for(double each : prices) {
            if(each > 50.0) {
                count++;
            }
        }
        System.out.println("There are "+ count +" prices that are more the 50 dollars");


        System.out.println("\n---- countries name length more than 7 - inclusive ----");
        int count1 = 0;
        for(String characters7 : countries) {
            if(characters7.length() >= 7) {
                System.out.print(characters7+ " ");
                count1++;
            }
        }
        System.out.println("\nThere are "+ count1 +" countries that have more than 7 characters");
    }
}
