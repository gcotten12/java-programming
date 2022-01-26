package ExtraPractice.ObjectPractice;

public class Rectangle {
    public static double width;
    public static double height;
    public static double area;

    public void setDimensions(double setWidth, double setHeight) {
        Rectangle.width = setWidth;
        Rectangle.height = setHeight;
        Rectangle.area = setHeight*setWidth;
    }

    public int getArea() {
        int finalArea = (int)area;
        return finalArea;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(4,10);
        System.out.println(rectangle.getArea());
    }

}
