package gmail.smoljarn.lesson28;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
   public double calculateArea() {
        return width * height;
    }

    @Override
    void displayInfo() {
        System.out.println("Shape: Rectangle");
        System.out.println("Width:" + width);
        System.out.println("Height:" + height);
        System.out.println("Area:" + calculateArea());
    }
}
