package assign3;

public class AS3Q4 {

    static double sqaureroot(double num) {
        if (num < 0) {
            throw new ArithmeticException("Can't find square root of -ve");
        }

        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        int num = -1;

        try {
            System.out.println(sqaureroot(num));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
