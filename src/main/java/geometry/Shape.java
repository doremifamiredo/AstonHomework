package geometry;

public interface Shape {

    double area();

    double perimeter();

    default void setFillColor(String color) {
        System.out.println("Установден цвет заливки " + color);
    }

    default void setBorderColor(String color) {
        System.out.println("Установлен цвет границ " + color);
    }
}
