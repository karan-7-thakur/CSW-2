package assign3;

public class AS3Q5 {

    public static void main(String[] args) {

        String num = "a";
        try {
            int n = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
            int number = 0;

            try {
                System.out.println(10 / number);
            } catch (ArithmeticException e1) {
                System.out.println(e1);
            }
        }

    }
}
