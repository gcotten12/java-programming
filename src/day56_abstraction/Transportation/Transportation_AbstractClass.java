package day56_abstraction.Transportation;

import day56_abstraction.Greeting;

public abstract class Transportation_AbstractClass {

    public abstract void transportPeople();
    public abstract void cost(int mile);

    public void start() {
        System.out.println("Starting the engine");
    }
    public void stop() {
        System.out.println("Shut off the engine");
    }

}

class Tesla extends Transportation_AbstractClass implements SelfDrivable, Greeting {
// Tesla IS-A Transportation_AbstractClass
    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile * .10) + " to drive " + mile + " miles");
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
