//package 3exp;

// RectanglePerimeter.java
public class RectanglePerimeter {
    private double length;
    private double breadth;

    public RectanglePerimeter(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        RectanglePerimeter rect = new RectanglePerimeter(10.0, 5.0);
        System.out.printf("Rectangle Length: %.2f, Breadth: %.2f%n", rect.length, rect.breadth);
        System.out.printf("Area: %.2f%n", rect.getArea());
        System.out.printf("Perimeter: %.2f%n", rect.getPerimeter());
    }
}
