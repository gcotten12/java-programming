package OfficeHours.day_5_12_21;

public class Bank {

    public static void main(String[] args) {

        BankAccount user1 = new BankAccount();
        user1.accountHolderName = "Garrett";
        user1.balance = 1_234;
        user1.pin = 123;
        user1.accountNumber = 1110456;
        System.out.println(user1.getBalance(123));

    }

}
