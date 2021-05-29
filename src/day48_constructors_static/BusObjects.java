package day48_constructors_static;

public class BusObjects {

    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.driver = new Driver("Murodil");
        bus.engine = new Engine(10);
        System.out.println(bus);
        System.out.println(bus.driver.getName());

    }
}
