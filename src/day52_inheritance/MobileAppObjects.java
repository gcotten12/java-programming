package day52_inheritance;

public class MobileAppObjects {

    public static void main(String[] args) {

        MobileApp newApp = new MobileApp();
        newApp.setName("Twitch");
        newApp.useTheApp(10);
        newApp.setVersion(10.132);
        newApp.download();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.useTheApp(20);

        Discord discordChat = new Discord();
        discordChat.setName("Discord");
        discordChat.useTheApp(15);
        discordChat.setVersion(33.519);
        discordChat.download();
        discordChat.printInfo();
    }

}
