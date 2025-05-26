package DateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;       //important for unit of time
import java.time.format.DateTimeFormatter;
public class LocalDateEx {
    public static void main(String[] args) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate obj = LocalDate.now();
        LocalDate obj1 = LocalDate.of(2004,5,5);
        LocalDate obj2 = LocalDate.parse("2001-07-03");

        

        System.out.println(obj);
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj.getDayOfMonth());
        System.out.println(obj.getDayOfYear());
        System.out.println(obj.getDayOfWeek());
        System.out.println(obj.getMonth());             //returns month name
        System.out.println(obj.getMonthValue());        //returns number of the month
        System.out.println(obj.isAfter(obj1));          //return boolean, if obj is after obj1
        System.out.println(obj.isBefore(obj1));         //return boolean, if obj is before obj1
        System.out.println(obj.compareTo(obj1));
        System.out.println(obj1.isLeapYear());
        System.out.println(obj.plusDays(5));        //doesn't change the original object but returns a new object with new date
        
        System.out.println(obj.plusMonths(2));
        System.out.println(obj.plusYears(1));
        System.out.println(obj.plus(1,ChronoUnit.DAYS));        // ChronoUnit defines where to chnage DD/MM/YYYY
        System.out.println(obj.minus(1,ChronoUnit.YEARS));
        
        System.out.println(obj.format(format));     // fomrat method takes Instance of DateTimeFormatter. Wont chnage the original date    

    }
}
