package day35_methods_with_param;

public class MultipleParams {
    public static void main(String[] args) {
        showSum(1,2);
    }
    public static void showSum(double num1 , double num2) {

        double sum = num1 + num2;
        System.out.println(sum);
    }
}
