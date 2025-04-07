
class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int area() {
        return width * length;
    }

    public int perimeter() {
        return 2 * (width + length);

    }

}

public class Q2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 10);
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Perimeter of Rectangle: " + rect.perimeter());

    }

}
