package day48_constructors_static;

import java.util.ArrayList;
import java.util.List;

public class CustomerObjects {

    public static void main(String[] args) {

        Customer cs1 = new Customer();
        System.out.println(cs1); // printing with default values
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);

        Customer cs2 = new Customer("Mike",2);
        System.out.println(cs2);

        Customer cs3 = new Customer("Garrett", 12);
        System.out.println(cs3);

        List<Customer> customerArr = new ArrayList<>();
        customerArr.add(cs1);
        customerArr.add(cs2);
        customerArr.add(cs3);
        customerArr.add(new Customer("Bill", 15));
        System.out.println(customerArr);

        System.out.println();

        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Tom",13)};
        for (Customer todaysCustomer : todaysCustomers) {
            System.out.println(todaysCustomer);
        }

    }

}
