package day24_loops;

public class ReverseCount {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        while(count >= 0) {
            System.out.println("count = " + count);
            count--;
        }
        System.out.println("\nFinished the count");

        int unReadSMS = 10;
        System.out.println("I have " + unReadSMS + " messages");
        while(unReadSMS > 0) {
            System.out.println("Reading SMS: " + unReadSMS);
            unReadSMS--;
            Thread.sleep(500);
        }
        System.out.println("No more unread messages");
    }
}
