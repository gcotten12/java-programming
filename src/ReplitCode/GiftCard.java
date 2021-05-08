package ReplitCode;

import java.util.*;

public class GiftCard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String thankYou = "Thank you for your purchase!";
        String storeItem = s.next();
        String accessory = "USB cable";
        int cost = 0;
        int giftCard = 100;
        if (storeItem.equals("Hat")) {
            cost = 25;
            System.out.println(thankYou);
            System.out.println("Your current balance is: "+(giftCard - cost)+"$");
        } else if (storeItem.equals("Pillow")) {
            cost = 40;
            System.out.println(thankYou);
            System.out.println("Your current balance is: "+(giftCard - cost)+"$");
        } else if (storeItem.equals("Blanket")) {
            cost = 60;
            System.out.println(thankYou);
            System.out.println("Your current balance is: "+(giftCard - cost)+"$");
        } else if (storeItem.equals("Laptop")) {
            cost = 101;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (storeItem.equals("Socks")) {
            cost = 5;
            System.out.println(thankYou);
            System.out.println("Your current balance is: "+(giftCard - cost)+"$");
        }else if (storeItem.equals("Charger")) {
            cost = 25;
            System.out.println(thankYou);
            System.out.println("Your current balance is: "+(giftCard - cost)+"$");
        } else if (storeItem.equals("Smartphone")) {
            cost = 101;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (storeItem.equals("Headphones")) {
            cost = 30;
            System.out.println(thankYou);
            System.out.println("Your current balance is: "+(giftCard - cost)+"$");
        } else if (storeItem.equals("Pants")) {
            cost = 50;
            System.out.println(thankYou);
            System.out.println("Your current balance is: "+(giftCard - cost)+"$");
        } else if (accessory.equals("USB cable")) {
            cost = 10;
            System.out.println(thankYou);
            System.out.println("Your current balance is: "+(giftCard - cost)+"$");
        } else{
            System.out.println("Invalid store item");
        }
    }
}
