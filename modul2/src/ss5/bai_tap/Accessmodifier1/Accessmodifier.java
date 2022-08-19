package ss5.bai_tap.Accessmodifier1;

public class Accessmodifier {
    private double radius;
    private String color;

    public Accessmodifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Accessmodifier() {
        this.radius = 1.0;
        this.color = "red";
    }
    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }
    public double area(){
        return this.radius * this.radius * 3.14;
    }
}
