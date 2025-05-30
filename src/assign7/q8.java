package assign7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class q8 {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime current = LocalDateTime.now();

        System.out.println("Date: " + current.format(format));
    }
}
