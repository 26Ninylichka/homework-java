package gmail.smoljarn.lesson28;

  public class Square extends Rectangle {
       public Square(double side) {
           super(side, side);
       }

       @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    void displayInfo() {
        System.out.println("Shape: Square");
        System.out.println("Side:" + height);
        System.out.println("Area:" + calculateArea());
    }
}
