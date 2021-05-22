package day46_encapsulation;

public class CapitalOne {

    public static void main(String[] args) {

        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNum(12345678);
        acc.setBalance(4118_95);
        acc.setAccountHolder("Garrett");
        System.out.println(acc);

    }
}
