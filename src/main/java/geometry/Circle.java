package geometry;

public class Circle extends Plan implements Shape {
    public double r;

    public Circle(double r, String fillColor, String borderColor) {
        super(fillColor, borderColor);
        this.r = r;
    }

    @Override
    public double area() {
        double area = Math.PI * Math.pow(r, 2);
        System.out.println("Площадь круга с радиусом " + r + " = " + area);
        return area;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * Math.PI * r;
        System.out.println("Периметр круга с радиусом " + r + " = " + perimeter);
        return perimeter;
    }
}
