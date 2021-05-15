package day45_oop;

public class TrafficLight {
    String color;

    public void showColor() {
        System.out.println("current color = " + color);
    }

    public void changeColor(String newColor) {
        System.out.println("changing color to " + newColor);
        color = newColor;

    }

}
