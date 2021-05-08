package day10_shorthand_operator;

public class ChangingBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("balance after buying baklave: " + balance);

        double kenafe = 44.45;
        System.out.println("kenafe = " + kenafe);
        balance = balance - kenafe;
        System.out.println("balance after kenafe: " + balance);

        //second kenafe is 50% off. lets buy it

        kenafe = kenafe / 2;
        System.out.println("kenafe = " + kenafe);
        balance = balance - kenafe;
        System.out.println("balance after buying second kenafe: " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("balance after plov: " + balance);

        double icedTea = 3.00;
        System.out.println("icedTea = " + icedTea);
       //buy 4 iced teas
        balance = balance - (4 * icedTea);
        System.out.println("balance after 4 iced teas = " + balance);

        //return baklava
        balance += baklava;
        System.out.println("balance after returning baklava: " + balance);



    }
}
