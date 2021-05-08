package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Let's watch: World's smallest cat- BBC");
        int seconds = 0;
        int video = 117;
        while(video >= seconds) {
            System.out.println("Watching YouTube video: seconds: " + seconds);
            seconds++;
            Thread.sleep(500);
        }
        System.out.println("Finished watching cat video");
    }
}
