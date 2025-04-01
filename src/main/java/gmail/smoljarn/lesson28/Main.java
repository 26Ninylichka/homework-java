package gmail.smoljarn.lesson28;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(6);
        circle.displayInfo();
        System.out.println();

        Shape rectangle = new Rectangle(5, 5);
        rectangle.displayInfo();
        System.out.println();

        Shape square = new Square(5);
        square.displayInfo();
        System.out.println();
    }
}
