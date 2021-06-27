package day57_abstraction_polmorphism.abstract_class_vs_interface;

// PUBLIC AND ABSTRACT KEY WORDS ARE AUTOMATICALLY IMPLEMENTED WHEN WE CREATE NON-STATIC/NON-DEFAULT
//  METHODS IN INTERFACE CLASS
// INTERFACE CLASS ONLY ACCEPTS ABSTRACT, STATIC, AND DEFAULT METHODS
// ALL METHODS MUST BE PUBLIC, THAT'S WHY THEY'RE ALL AUTOMATICALLY PUBLIC
// DEFAULT METHOD IS A METHOD WITH A BODY IN INTERFACE CLASS
// WHEN CREATING VARIABLES IN INTERFACE CLASS THEY ARE AUTOMATICALLY CREATED AS PUBLIC STATIC FINAL
// INTERFACE CLASSES CAN EXTEND MULTIPLE INTERFACE CLASSES(DOES NOT IMPLEMENT)
public interface InterfaceA extends InterfaceB{
    static final String TYPE = "interface";
    double MAX_COUNT = 500; // THIS IS AUTOMATICALLY PUBLIC STATIC FINAL

    void absMethodD(int num);

    static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str - " + str);
    }

    default void defaultMethodF() {
        System.out.println("defaultMethodF is called");
    }

}
