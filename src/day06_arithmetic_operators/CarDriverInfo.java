package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "2015 Volkswagen cc";
        String driverName = "Garrett Cotten";
        int licenseNumber = 40016543;
        byte speed = 39;
        boolean isAutomatic = true;
        char licenseClass = 'A';

        System.out.println("Provide the vehicle model: " + carModel);
        System.out.println("Name of driver: " + driverName);
        System.out.println("What is the license number provided on your ID?\n" + licenseNumber);
        System.out.println("Traveling speed: " + speed + "mph");
        System.out.println("Is it an automatic?\n" + isAutomatic);
        System.out.println("Class Type: " + licenseClass);
        System.out.println(carModel + driverName);



    }

}
