package gmail.smoljarn.lesson28;

abstract class Shape {

    abstract double calculateArea();

    abstract double calculatePerimeter();


    void displayInfo() {
        System.out.println("Площа: " + calculateArea());
        System.out.println("Периметр: " + calculatePerimeter());
    }
}

