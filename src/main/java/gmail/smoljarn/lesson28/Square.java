package gmail.smoljarn.lesson28;

   class Square extends Rectangle {
       public Square(double side) {
           super(side, side);
       }

       @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    void displayInfo() {
        System.out.println("Shape: Square");
        System.out.println("Side:" + width);
        System.out.println("Area:" + calculateArea());
    }
}
