package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'B';
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Passed with "+grade);
        }else if(grade == 'D') {
            System.out.println("qualify for retake");
        }else if (grade == 'E') {
            System.out.println("Fail");
        }else {
            System.out.println("Invalid score");
        }
    }
}
