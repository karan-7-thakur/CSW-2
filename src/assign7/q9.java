package assign7;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class q9 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2025, 05, 20);
        LocalDate current = LocalDate.now();
        long days = (ChronoUnit.DAYS.between(start, current) / 365);

        int p = 100000;
        float r = 0.08f;

        System.out.println("SI: " + (p * r * days) / 100);
    }
}
