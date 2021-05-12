package day44_custom_classes;

public class AnimalObjects {

    public static void main(String[] args) {
        Animals animal = new Animals();
        System.out.println(animal.type);
        animal.eat("grass");
        animal.speak();
        // create object cheetahObj
        Animals cheetaObj = new Animals();
        cheetaObj.type = "cheeta";
        System.out.println(cheetaObj.type);
        cheetaObj.eat("antelope");
        cheetaObj.speak();

    }
}
