package gmail.smoljarn.lesson28;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    void displayInfo() {
        System.out.println("Shape: Circle");
        System.out.println("Radius:" + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
