package day45_oop;

public class TrafficLight {
    String color;

    public void showColor() {
        System.out.println("current color = " + color);
    }

    public void changeColor(String newColor) {
        if (newColor.equalsIgnoreCase("green") || newColor.equalsIgnoreCase("yellow")
                || newColor.equalsIgnoreCase("red")) {
            color = newColor;
        } else {
            System.out.println("not valid color");
        }

    }

}
