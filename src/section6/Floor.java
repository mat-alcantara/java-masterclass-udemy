package section6;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width < 0 ? this.width = 0 : width;
        this.length = length < 0 ? this.length = 0 : length;
    }

    public double getArea() {
        return width * length;
    }
}