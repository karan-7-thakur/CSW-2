class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    };

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;

    }

    public void print() {
        System.out.print("x:" + x);
        System.out.println(" y:" + y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class Q3 {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(p1);

        p2.setX(100);

        p1.print();
        p2.print();

    }

}
