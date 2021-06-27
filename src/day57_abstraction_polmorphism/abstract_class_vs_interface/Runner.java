package day57_abstraction_polmorphism.abstract_class_vs_interface;

public class Runner {

    public static void main(String[] args) {

//        WE CAN NOT CREATE AN OBJECT OF AN ABSTRACT/INTERFACE CLASS
//        AbstractA absA = new AbstractA();
//        InterfaceA IA = new InterfaceA();

        InterfaceA.staticMethodE("wooden spoon");
        ConcreteA.staticMethodC();
        // ConcreteA.staticMethodE(); -> staticMethodE only works with interface.staticMethodE

    }
}
