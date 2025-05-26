package DateTime;

import java.time.LocalDateTime;

public class LocalDateTimeEx {
public static void main(String[] args) {
    LocalDateTime obj = LocalDateTime.now();
    LocalDateTime obbj1 = LocalDateTime.parse("2001-07-03T05:30:30.1234567");

    System.out.println(obj);
    System.out.println(obbj1);
}
}
