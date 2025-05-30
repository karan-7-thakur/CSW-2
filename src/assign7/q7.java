package assign7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class q7 {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");

        LocalDateTime time = LocalDateTime.now();

        System.out.println(time);
        System.out.println("Date: " + time.toLocalDate());
        System.out.println("Time: " + time.toLocalTime());

        System.out.println(time.plus(2, ChronoUnit.WEEKS).toLocalDate());
        System.out.println(time.format(format));

    }
}
