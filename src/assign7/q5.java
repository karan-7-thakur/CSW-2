package assign7;

import java.util.function.Function;

public class q5 {

    public static Function<Integer, Integer> getSquare() {
        return X -> X * X;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> sq = getSquare();
        System.out.println("Square of 10: " + sq.apply(10));

    }
}
