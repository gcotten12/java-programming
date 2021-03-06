package day56_abstraction;

public interface Greeting {
    void hi();
    void bye();

}

class MountainLanguage implements Greeting {

    @Override
    public void hi() {
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }
}

class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();
        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();
        Greeting gt2 = new Japanese();
        gt2.hi();
        gt2.bye();
    }
}

class Japanese implements Greeting {

    @Override
    public void hi() {
        System.out.println("Kon'nichiwa");
    }

    @Override
    public void bye() {
        System.out.println("Sayōnara");
    }
}