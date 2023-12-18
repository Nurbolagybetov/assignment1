import models.Shape;
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.addPoint(new Point(x,y));
        shape.addPoint(new Point(x,y));
        shape.addPoint(new Point(x,y));
        shape.addPoint(new Point(x,y));
        shape.addPoint(new Point(x,y));

        System.out.println(shape.calculatorPerimeter());
        System.out.println(shape.getLongest());
    }
}