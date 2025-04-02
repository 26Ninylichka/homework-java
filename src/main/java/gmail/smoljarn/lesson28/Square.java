package gmail.smoljarn.lesson28;

  public class Square extends Rectangle {

      private double side;

      public Square (double side) {
          super(side,side);
          this.side = side;
      }

      @Override
      public double calculateArea() {
          return super.calculateArea();
      }

      @Override
      public double calculatePerimeter() {
          return 4 * side;
      }

      @Override
    void displayInfo() {
        System.out.println("Shape: Square");
        System.out.println("Side:" + side);
        System.out.println("Area:" + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
