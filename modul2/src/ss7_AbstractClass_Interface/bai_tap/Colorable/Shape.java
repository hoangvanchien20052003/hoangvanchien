package ss7_AbstractClass_Interface.bai_tap.Colorable;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    abstract double getArea();
    abstract double getPerimeter();
    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of " + this.color + " and " + ((isFilled()) ? "Filled" : "not filled");
    }
}
