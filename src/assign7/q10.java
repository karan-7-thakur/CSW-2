package assign7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class q10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        LocalDate start = LocalDate.parse(sc.nextLine());
        System.out.print("End: ");
        LocalDate end = LocalDate.parse(sc.nextLine());

        System.out.println(ChronoUnit.DAYS.between(start, end));

    }
}