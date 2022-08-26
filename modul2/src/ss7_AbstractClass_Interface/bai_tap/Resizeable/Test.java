package ss7_AbstractClass_Interface.bai_tap.Resizeable;

public class Test {
    public static void main(String[] args) {
        double percent = Math.random() * (100-1+1)+1;
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();
        System.out.println("Trước khi thay đổi giá trị: ");
        for (Shape shape: shapes){
            System.out.println(shape.getArea());
        }
        System.out.println("Sau khi thay đổi giá trị: ");
        for (Shape shape: shapes){
            shape.resize(percent);
            System.out.println(shape.getArea());
        }
    }
}
