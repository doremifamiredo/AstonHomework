package geometry;

public class Triangle extends Plan implements Shape {
    protected int a;
    protected int b;
    protected int c;

    public Triangle(int a, int b, int c, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        float p = (float) ((a + b + c) / 2);
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника со сторонами " + a + ", " + b + ", " + c + " = " + area);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = a + b + c;
        System.out.println("Периметр треугольника со сторонами " + a + ", " + b + ", " + c + " = " + perimeter);
        return perimeter;
    }
}
