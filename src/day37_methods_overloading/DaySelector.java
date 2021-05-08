package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(4));
        System.out.println(getDayName(8));

        for(int i = 0; i <= 8; i++) {
            System.out.println(getDayName(i));
        }
        
        String today = getDayName(6);
        System.out.println("today = " + today);

    }

    public static String getDayName(int day) {
        String result = "";
        switch (day) {
            // case(1): return "Monday"; works and you would not need to include any other variables but most companies dont like a lot of return statements
            case (1): result = "Monday";
                break;
            case (2): result = "Tuesday";
                break;
            case (3): result = "Wednesday";
                break;
            case (4): result = "Thursday";
                break;
            case (5): result = "Friday";
                break;
            case (6): result = "Saturday";
                break;
            case (7): result = "Sunday";
                break;
            default: result = "Invalid Day"; // this line is skipped by the null return statement
                return null;
        }
        return result; // only 1 return statement makes the code better
    }

}
