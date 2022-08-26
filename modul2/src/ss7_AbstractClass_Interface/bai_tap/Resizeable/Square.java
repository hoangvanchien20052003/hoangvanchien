package ss7_AbstractClass_Interface.bai_tap.Resizeable;

public class Square extends Shape {
    private double side;

    public Square() {
    }

    @Override
    double getArea() {
        return this.side * this.side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, boolean filled, String color) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    @Override
    public String toString() {
        return "A Square with side= " +
                getSide() + ", which is a subclass of " +
                super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side += percent;
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, true, "yellow");
        System.out.println(square);
    }


}
