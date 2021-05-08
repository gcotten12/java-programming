package day28_loops;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;
        for(int days = 1; days <= 30; days++) {
            if(days % 7 == 0) {
                totalCases += 500;
            }else{
                totalCases += 200;
            }
            System.out.println("day "+ days +" - total cases: "+ totalCases);
        }
    }
}
