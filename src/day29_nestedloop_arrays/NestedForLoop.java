package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {

        for(int minutes = 0; minutes <= 4; minutes++) {
            for(int seconds = 0; seconds < 60; seconds++) {
                System.out.println(minutes + " : " + seconds + " am");
                Thread.sleep(500);
            }
        }
    }
}
