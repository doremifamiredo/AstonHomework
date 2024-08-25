package geometry;

public class Rectangle extends Plan implements Shape {
    protected double a;
    protected double b;

    public Rectangle(double a, double b, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        double area = a * b;
        System.out.println("Площадь прямоугольника со сторонами " + a + ", " + b + " = " + area);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * (a + b);
        System.out.println("Периметр прямоугольника со сторонами " + a + ", " + b + " = " + perimeter);
        return perimeter;
    }
}
