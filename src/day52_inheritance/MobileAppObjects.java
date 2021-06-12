package day52_inheritance;

public class MobileAppObjects {

    public static void main(String[] args) {

        MobileApp newApp = new MobileApp();
        newApp.name = "Twitch";
        newApp.useTheApp(10);

        Instagram instagram = new Instagram();
        instagram.name = "Instagram";
        instagram.useTheApp(20);

        Discord discordChat = new Discord();
        discordChat.name = "Discord";
        discordChat.useTheApp(15);

    }

}
