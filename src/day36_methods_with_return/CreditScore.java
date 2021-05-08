package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(738);
        checkEligible(getCreditScore());

        int score = getCreditScore();


    }
    public static void checkEligible(int creditScore) {
        if(creditScore >= 700) {
            System.out.println("you are eligible for leasing this car");
        }else {
            System.out.println("Sorry, you are not eligible for leasing this car");
        }
    }
    public static int getCreditScore() {
        return 700;
    }

}
