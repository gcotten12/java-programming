package day58_polymorphism.superman_polymorphism_example;

public class Casting {
    public static void main(String[] args) {
        // variables of worker and object of superMan
        Worker worker = new SuperMan();
        worker.work("Dev");
        worker.getPaid();

        ((Father)worker).raiseKid();
        ((Father)worker).playWithKid();

        // DOWNCASTING from worker to SuperMan
        // When parent comes down to child
        SuperMan superMan = (SuperMan) worker;
        superMan.feedKid();
    }

}
