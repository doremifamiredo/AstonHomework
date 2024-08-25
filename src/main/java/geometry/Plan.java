package geometry;

public class Plan {
    protected String fillColor;
    protected String borderColor;

    public String getBorderColor() {
        return borderColor;
    }

    public String getFillColor() {
        return fillColor;
    }

    public Plan(String fillColor, String borderColor) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    public void shapeInfo(Circle circle) {
        circle.area();
        circle.perimeter();
        circle.setBorderColor(fillColor);
        circle.setFillColor(borderColor);
    }

    public void shapeInfo(Triangle triangle) {
        triangle.area();
        triangle.perimeter();
        triangle.setFillColor(fillColor);
        triangle.setBorderColor(borderColor);
    }

    public void shapeInfo(Rectangle rectangle) {
        rectangle.area();
        rectangle.perimeter();
        rectangle.setFillColor(fillColor);
        rectangle.setBorderColor(borderColor);
    }


}
