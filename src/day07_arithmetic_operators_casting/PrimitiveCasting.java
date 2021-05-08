package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int num1 = 100;
        byte b1 = (byte)num1;
        System.out.println(b1);
        short shNum1 = (short)num1;
        System.out.println(b1);
        System.out.println("result a" + 0 + 1);
        System.out.println("result b" + (1 + 2));
        System.out.println("2 + 2 =" + 2 + 2);
        long a = 30L;
        long b = (short)a;
        System.out.println(b);
        int num = -5;
        System.out.println(num++ + ",");
        System.out.println(num = 0);
        System.out.println("," + --num);
        short num3 = -5;
        boolean one = 0 == (9-10+1);
        System.out.println("one = " + one);
        String name = "";
        name += num3;
        System.out.println(name);



    }
}
