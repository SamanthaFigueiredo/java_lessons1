import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 

public class DateFormatterTest{
   public static void main(String [] args){
LocalDateTime now = LocalDateTime.now();

        System.out.println("Before : " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formatDateTime = now.format(formatter);

        System.out.println("After : " + formatDateTime);
}
}
