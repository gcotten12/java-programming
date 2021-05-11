package day39_wrapper_classes;

import com.sun.org.apache.xpath.internal.operations.Bool;
import sun.jvm.hotspot.debugger.windbg.DLL;

public class WrapperClasses {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("num = " + num);
        num += 10;
        System.out.println(num);
        
        Integer n = new Integer(500);
        System.out.println("n = " + n);
        System.out.println(n.equals(500));
        System.out.println(n + 300);

        Integer intObject = 1000;
        System.out.println(intObject / 50);

        Integer n2 = 1000;
        String str = "hello";
        // convert n2 to String
        String numStr = n2 + "";
        String numSt = n2.toString();

        System.out.println();

        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;
        Short s1 = new Short((short)40);
        Short s2 = 50;
        Integer i1 = new Integer(100);
        Integer i2 = 200;
        Long l1 = new Long(300L);
        Long l2 = 3455L;

        Float f1 = new Float(5.2F);
        Float f2 = 45.3F;

        Double d1 = new Double(345.5);
        Double d2 = 234.5;

        Character ch1 = new Character('Q');
        Character ch2 = 'V';

        Boolean bo1 = new Boolean(true);
        Boolean bo2 = false;

        i2 = 100;
        System.out.println(i1.equals(i2));



    }
}
