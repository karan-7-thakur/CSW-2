package DateTime;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeEx {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.now();
        LocalTime time2 = LocalTime.parse("05:30:30.1234567");

        System.out.println(time1);
        System.out.println(time2);

        System.out.println(time1.getHour());
        System.out.println(time1.getMinute());

        System.out.println(time1.plusHours(5));
        System.out.println(time1.plus(10, ChronoUnit.HOURS));
    }
}
