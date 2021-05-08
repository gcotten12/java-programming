package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        sitInCar();
        startThrCar();
        shiftToDrive();
        pressGasPetal();



    }
    public static void sitInCar() {
        System.out.println("1. Open the door and sit in driver seat"); }
    public static void startThrCar() {
        System.out.println("2. Insert key to ignition then turn clockwise"); }
    public static void shiftToDrive() {
        System.out.println("3. Shift the clutch to drive"); }
    public static void pressGasPetal() {
        System.out.println("4. Press foot on gas petal"); }
}
