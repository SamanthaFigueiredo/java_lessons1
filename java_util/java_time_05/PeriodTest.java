import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodTest {
    public static void main(String[] args) { 
                          LocalDate currentDate = LocalDate.now().minusYears(5);
                             LocalDate birthday = LocalDate.of(1960, Month.JANUARY, 1);
		 Period p = Period.between(birthday, currentDate);
                             System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
                                                           " months, and " + p.getDays() + " days old"); 
    }
}
