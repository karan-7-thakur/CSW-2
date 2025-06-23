import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.function.Consumer;


@FunctionalInterface
interface Greeting {
    void sayHello(String name);
}

public class LambdaAndDateTimeDemo {
    public static void main(String[] args) {

        // -----------------------------------
        // 1. LAMBDA EXPRESSION DEMO
        // -----------------------------------

        // Lambda expression implementing a functional interface
        Greeting greet = (name) -> System.out.println("Hello, " + name + "! Welcome to Lambda Expressions.");
        greet.sayHello("Karan");

        // Another example using Java's built-in functional interface: Consumer
        Consumer<String> printer = message -> System.out.println("Message: " + message);
        printer.accept("Lambda expressions make Java concise!");

        // -----------------------------------
        // 2. DATE AND TIME API DEMO
        // -----------------------------------

        // Getting current date and time
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("\nToday's Date       : " + today);
        System.out.println("Current Time       : " + now);
        System.out.println("Current Date & Time: " + currentDateTime);

        // Creating a specific date
        LocalDate birthDate = LocalDate.of(2005, Month.DECEMBER, 15);
        System.out.println("\nBirth Date         : " + birthDate);

        // Calculate age using Period
        Period age = Period.between(birthDate, today);
        System.out.println("You are " + age.getYears() + " years, " + age.getMonths() + " months old.");

        // Duration example (time difference)
        LocalTime startTime = LocalTime.of(10, 0);
        LocalTime endTime = LocalTime.of(12, 45);
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("\nTime Duration      : " + duration.toMinutes() + " minutes");

        // Formatting the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted Date     : " + formattedDate);

        // Comparing dates
        if (birthDate.isBefore(today)) {
            System.out.println("Your birthday is in the past.");
        } else {
            System.out.println("Your birthday is in the future.");
        }
    }
}
