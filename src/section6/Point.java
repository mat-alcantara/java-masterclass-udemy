package section6;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.getX(), 2) + Math.pow(this.getY(), 2)) ;
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.getX() - x, 2) + Math.pow(this.getY() - y, 2));
    }

    public double distance(Point another) {
        return Math.sqrt(Math.pow(this.getX() - another.getX(), 2) + Math.pow(this.getY() - another.getY(), 2));
    }
}