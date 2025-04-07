package assign3;

import java.util.Scanner;

public class AS3Q3 {

    static int convert(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Number " + str);
            System.out.print("Enter a new Number: ");
            String num2 = new Scanner(System.in).next();

            return convert(num2);
        }

    }

    public static void main(String[] args) {
        String num = "1234k6";

        int nums = convert(num);
        System.out.println(nums);
    }
}
