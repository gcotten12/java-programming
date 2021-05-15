package day45_oop;

public class TrafficLightObjects {

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight();
        light.color = "green";
        light.showColor();
        light.changeColor("yellow");
        light.changeColor("red");
        System.out.println("the color of the light = " + light.color);

    }
}
