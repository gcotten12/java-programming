package day45_oop;

public class TrafficLightObjects {

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight();
        light.changeColor("green");
        light.showColor();
        light.changeColor("blue");
        light.showColor();

    }
}
