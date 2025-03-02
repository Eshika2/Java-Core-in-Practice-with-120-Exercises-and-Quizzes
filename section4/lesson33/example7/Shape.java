package section4.lesson33.example7;

public interface Shape {

    double getArea();

    static Shape createCircle(double radius) {
        return new Circle(radius);
    }
}
