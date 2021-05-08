package ReplitCode;

public class sentence {
    public static void main(String[] args) {
        String str = "hello my name is garrett";
        String st2 = " ello my name is garrett";
        int index = st2.indexOf("hello");
        System.out.println(index);
        System.out.println(st2.startsWith("ello"));

        int count = 0;
        for(int a = 0; a < 4; a++) {
            if(a == 2) continue;
            count++;
        }
        System.out.println(count);
    }
}
