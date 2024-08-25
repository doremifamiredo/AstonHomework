import com.github.javafaker.Faker;
import geometry.Circle;
import geometry.Rectangle;
import geometry.Triangle;
import org.junit.jupiter.api.Test;

class GeometryTest {

    Faker faker = new Faker();
    int random() {
        int max = 100;
        return (int) Math.round(Math.random() * max);
    }

    @Test
    void circleTest() {
        Circle circle = new Circle(random(), faker.color().name(), faker.color().name());
        circle.shapeInfo(circle);
    }

    @Test
    void triangleTest() {
        Triangle triangle = new Triangle(random(), random(), random(), faker.color().name(), faker.color().name());
        triangle.shapeInfo(triangle);
    }

    @Test
    void rectangleTest() {
        Rectangle rectangle = new Rectangle(random(), random(), faker.color().name(), faker.color().name());
        rectangle.shapeInfo(rectangle);
    }
}