package ss6.bai_tap.circle_and_cylinder;

public class Cyclinder extends Circle {

    private double high;

    public Cyclinder() {

    }

    public Cyclinder(double radius, String color, double high) {
        super(radius, color);
        this.high = high;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getVolume() {
        return this.high * this.getRadius() * this.getRadius() * 3.14;
    }

    @Override
    public String toString() {
        return
                "{high=" + high + super.toString();
    }
}
