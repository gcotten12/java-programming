package day50_inheritance;

public class StaticBlockTest {

    public static void main(String[] args) {

        StaticBlockDemo st1 = new StaticBlockDemo(); // +5
        StaticBlockDemo st2 = new StaticBlockDemo(); // +5
        StaticBlockDemo st3 = new StaticBlockDemo(); // +5
        System.out.println(StaticBlockDemo.num); // num = 25

    }

}
