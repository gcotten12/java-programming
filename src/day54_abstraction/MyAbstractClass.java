package day54_abstraction;

public abstract class MyAbstractClass {
    int num = 55;
    public void learn() {
        System.out.println("Learning...");
    }

    public abstract void close();

}

class Sub extends MyAbstractClass {
    @Override
    public void close() {
        System.out.println("Close - abstract method implementation");
    }
}

class MyObjects {

    public static void main(String[] args) {
        // MyAbstractClass mac = new MyAbstractClass(); -> ERROR

    }
}
