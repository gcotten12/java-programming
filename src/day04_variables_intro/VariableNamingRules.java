package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args) {
        // System.out.println();
        // int static = =22;  ERROR, static is reserved by Java
        int static2 = 22;
        int _static = 23;
        int $tatic = 24;
        int staticVar = 25;

        int salary$ = 55;
        // int 1stMonthlySalary = 3000; ERROR, cannot start with number
        int $ = 10;
        int _ = 3;
        // Both of the above variables work but are not recommended
        // int number-of-friends = 401; ERROR, cannot use -
        int numberOfFriends = 401;
        int number_of_friends = 401; // not conventional

    }
}
