package day47_constructors;

public class AddressList {

    public static void main(String[] args) {

        Address home = new Address();
        home.setStreet("1730 Amalfi Dr");
        home.setCity("Rockwall");
        home.setState("Tx");
        home.setZipcode(75032);
        System.out.println(home);
        
        Address oldHome = new Address("2333 Elkride Dr", "Mesquite", "Tx", 75181);
        System.out.println("oldHome = " + oldHome);

    }

}
