package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double balance = 345.55, price1 = 20.88, price2 = 89.99, price3 = 15;
        double remainingBalance = (balance - (price1+price2+price3));
        System.out.println(remainingBalance);
        int remainingWithNoCents = (int)remainingBalance;
        System.out.println("Your remaining balance without cents: $" + remainingWithNoCents);
        char letter ='a';
        int numLetter = letter;
        System.out.println(numLetter);

    }
}
