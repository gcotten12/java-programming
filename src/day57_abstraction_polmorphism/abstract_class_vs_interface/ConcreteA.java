package day57_abstraction_polmorphism.abstract_class_vs_interface;

// FOR A CLASS TO BE CONCRETE, ITS DIRECT PARENT MUST BE CONCRETE
// SUB CLASSES CAN OVERRIDE NON-FINAL METHODS FROM PARENT CLASS
// SUB CLASS MUST OVERRIDE ALL ABSTRACT METHODS FROM EXTENDED/IMPLEMENTED CLASSES
// OVERRIDED METHODS MUST HAVE SAME NAME AND PARAMS
public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {

    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");
    }

    @Override
    public void methodB() {
        System.out.println("methodB overridden version is called");
    }

    // @Override -> static methods are hidden
    public static void staticMethodC() {
        System.out.println("staticMethodC hidden version is called");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD implementation is called with num - " + num);
    }

}
