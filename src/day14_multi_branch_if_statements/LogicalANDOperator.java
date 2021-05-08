package day14_multi_branch_if_statements;

public class LogicalANDOperator {
    public static void main(String[] args) {
        int bats = 3, balls = 10;
        System.out.println(bats > 2 && balls < 15);

        System.out.println();

        if(bats < 4 && balls > 7) {
            System.out.println("Play Ball!");
        }else {
            System.out.println("No Game!");
        }
    }
}
