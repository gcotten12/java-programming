package day48_constructors_static;

public class CustomerObjects {

    public static void main(String[] args) {

        Customer cs1 = new Customer();
        System.out.println(cs1); // printing with default values
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);


    }

}