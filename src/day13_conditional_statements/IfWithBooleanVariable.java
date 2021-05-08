package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if(isHungry) {
            System.out.println(	"I am hungry, I will go get something to eat.");
            System.out.println("Then code java");
        }else {
            System.out.println("I am not hungry. Lets keep coding java");
        }

        double price = 130.44;
        boolean isAffordable = 200>=price;

        if(isAffordable) {
            System.out.println("It is affordable");
        }else {
            System.out.println("It is not affordable");
        }

        boolean isRemote = true;
        if(!isRemote) { //! before variable instead of != value
            System.out.println("I am not interested");
        }else {
            System.out.println("What is the interview process");
        }
    }
}
