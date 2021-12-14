package section6;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }
}