import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDateTime currentDate = LocalDateTime.now();
        System.out.println("Today’s Date is: " + currentDate);

        Month currentMonth = currentDate.getMonth();
        System.out.println("Current Month is: " + currentMonth);
    }
}
