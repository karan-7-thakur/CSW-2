package assign7;

import java.util.ArrayList;
import java.util.Arrays;

interface Calculator {
    public double calculate(double a, double b);
}

public class q2 {

    public static void main(String[] args) {
        double num1 = 10.1d;
        double num2 = 10.1d;

        Calculator add = (x, y) -> x + y;
        Calculator sub = (x, y) -> x - y;
        Calculator mul = (x, y) -> x * y;
        Calculator div = (x, y) -> {
            if (y != 0) {
                return (x / y);
            }
            return 0;
        };

        System.out.println(add.calculate(num1, num2));
        System.out.println(mul.calculate(num1, num2));

        // Extra ------------------------------------------------
        // No neeed
        ArrayList<Calculator> op = new ArrayList<>();
        op.add(add);
        op.add(sub);
        op.add(mul);
        op.add(div);

        op.forEach((ele) -> {
            double var = ele.calculate(num1, num2);
            System.out.println(var);
        });

    }

}
