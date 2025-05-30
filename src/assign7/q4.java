package assign7;

interface Shape {
    public double area();

    default void printArea(String shape) {
        System.out.println(shape + " : " + area());
    }

}

interface Shape2 {
    public double area();

    default void printArea() {
        System.out.println(getName() + " : " + area());
    }

    String getName();

}

public class q4 {
    public static void main(String[] args) {
        int r = 10;
        int a = 5;
        int b = 6;

        Shape circle = () -> {
            return Math.PI * Math.pow(r, 2);
        };

        Shape react = () -> {
            return a * b;
        };

        Shape square = () -> {
            return a * a;
        };

        circle.printArea("Circle");
        react.printArea("Reactangle");
        square.printArea("Square");

        // Extra -------------------------------------------------------
        // No need
        // Using Anonymous class:
        // We can add more methods than a single abstract method in case of lambda
        Shape2 cir = new Shape2() {
            @Override
            public double area() {
                return Math.PI * Math.pow(r, 2);
            }

            // Used as a field var
            @Override
            public String getName() {
                return "Circle";
            }

        };

        cir.printArea();

    }

}
