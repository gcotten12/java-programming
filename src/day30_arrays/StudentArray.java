package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = {"12345", "Garrett", "Cotten", "B22", "214-797-2011"};

        System.out.println("id: " + student1[0]);
        System.out.println("full name: " + student1[1].toUpperCase() + " " + student1[2].toUpperCase());
        System.out.println("batch number: " + student1[3]);
        System.out.println("phone number: " + student1[4]);

        System.out.println("student data length: " + student1.length);

        for (int i = 0; i < student1.length - 1; i++) {
            System.out.println(student1[i]);
        }

        // check if student data array contains 5 items
        // true: Pass: data array correct length
        // false: Fail: data array has incorrect length


        if (student1.length == 5) {
            System.out.println("Pass: data array correct length");
        } else {
            System.out.println("Fail: data array has incorrect length");
        }

        String mobileNum = student1[4];
        System.out.println("\n"+mobileNum);
    }
}
