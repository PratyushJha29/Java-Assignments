
class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        this(1, 1);
    }
    Rectangle(double size) {
        this(size, size);
    }

    Rectangle(double width, double height) {
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException();
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }
    boolean isSquare() {
        return width == height;
    }

    void scale(double factor) {
        if (factor <= 0)
            return;

        width *= factor;
        height *= factor;
    }

    public String toString() {
        return "Width: " + width + ", Height: " + height;
    }
}

public class RectangleModel {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        System.out.println(r1.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.isSquare());

        r3.scale(2);
        System.out.println(r3);
    }
}

