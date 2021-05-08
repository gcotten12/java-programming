package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "mercedes", model = "A";
        String make1 = "audi", model2 = "A3";
        int leasePrice = 0;

        if (make.equals("mercedes") && model.equals("A")) {
            leasePrice = 400;
        }else if (make.equals("mercedes") && model.equals("E")) {
            leasePrice = 500;
        } else {
            System.out.println("Invalid make and model");
        }if (make.equals("audi") && model.equals("SQ5")) {
            leasePrice = 552;
        }else if (make.equals("audi") && model.equals("A3")) {
            leasePrice = 412;
        }
        System.out.println("I will lease a "+make+" "+model+" for "+leasePrice);

        if (make1.equals("mercedes")) {
            if (model2.equals("A")) {
                leasePrice = 400;
            }else if (model2.equals("E")) {
                leasePrice = 500;
            } else {
                System.out.println("Invalid make or model");
            }
        }if (make1.equals("audi")) {
            if (model2.equals("SQ5")) {
                leasePrice = 552;
            }else if (model2.equals("A3")) {
                leasePrice = 412;
            } else {
                System.out.println("Invalid make or model");
            }
            System.out.println("I will lease a "+make1+" "+model2+" for "+leasePrice);
        }
    }
}
