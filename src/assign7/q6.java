package assign7;

import java.util.function.Function;

public class q6 {

    public static Function<Integer, Integer> getFactorial() {
        return num -> {
            int ans = 1;
            for (int i = num; i > 1; i--) {
                ans *= i;
            }
            return ans;
        };

    }

    public static void main(String[] args) {
        Function<Integer, Integer> fact = getFactorial();
        System.out.println("Factorial of 6: " + fact.apply(6));

    }
}
