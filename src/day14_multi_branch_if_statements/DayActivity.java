package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("It is "+weather+" go to park, hiking, and code java");
        }else if(weather.equals("rainy")) {
            System.out.println("It is "+weather+" stay home, drink tea, and code java");
        }else if(weather.equals("snowy")) {
            System.out.println("It is "+weather+" builds snowman, drink hot chocolate, and code java");
        }else if(weather.equals("windy")) {
            System.out.println("It is "+weather+" get ready to lose power, fly a kite, and code java");
        }else {
            System.out.println("just keep coding java");
        }
    }
}