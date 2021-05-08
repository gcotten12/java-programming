package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [ Nadir ] From Number<2223334444> Message: {Hello, lets code some java}";
        int start1 = message.indexOf("[");
        int end1 = message.indexOf("]");
        String sender = message.substring(start1 + 1, end1);
        int start2 = message.indexOf("<");
        int end2 = message.lastIndexOf(">");
        String phoneNumber = message.substring(start2 + 1, end2);
        int start3 = message.indexOf("{");
        int end3 = message.lastIndexOf("}");
        String textMessage = message.substring(start3 + 1, end3);
        System.out.println("Sender: " + sender.trim() + "\nPhone Number: " + phoneNumber + "\nMessage: " + textMessage);
    }

}
