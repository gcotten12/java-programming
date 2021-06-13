package day53_inheritance.tesla;

public class CarObjects {

    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesle", "Model Y", 49500.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1);
        System.out.println("# of cars = " + ec1.getCount());

        Roadster ec2 = new Roadster("Roadster", 200000, 2022, 620);
        ec2.drive(130);
        System.out.println(ec2);
        System.out.println("# of cars = " + ElectricCar.count);

    }

}
