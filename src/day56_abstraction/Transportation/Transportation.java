package day56_abstraction.Transportation;

import day56_abstraction.Greeting;

public abstract class Transportation {

    public abstract void transportPeople();
    public abstract void cost(int mile);

    public void start() {
        System.out.println("Starting the engine");
    }
    public void stop() {
        System.out.println("Shut off the engine");
    }

}

class Tesla extends Transportation implements SelfDrivable, Greeting {
// Tesla IS-A Transportation_AbstractClass
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs $" + (mile * 0.25) + " to drive " + mile + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is driving in auto-pilot");
    }

    @Override
    public void hi() {
        System.out.println("Tesla is saying HI");
    }

    @Override
    public void bye() {
        System.out.println("Tesla is saying BYE");
    }
}

interface SelfDrivable {
    void autoPiloting();
}

class Plane extends Transportation implements SelfDrivable {

    @Override
    public void transportPeople() {
        System.out.println("Plane is transporting passengers through the air");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane costs $" + (mile * 2.0) + " to fly " + mile + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Plane is flying in auto-pilot");
    }
}

class TransportationObjects {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        tesla.start();
        tesla.transportPeople();
        tesla.autoPiloting();
        tesla.cost(20);
        tesla.stop();
        Plane plane = new Plane();
        plane.start();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(350);
        plane.stop();
    }
}
