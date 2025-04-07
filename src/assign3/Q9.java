package assign3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int num = sc.nextInt();
            System.out.println(num + 100);
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

    }
}
