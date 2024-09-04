import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
    public static void main(String[] args) {
   	 Calendar dateInstance = GregorianCalendar.getInstance();
   	 
   	 dateInstance.set(Calendar.DAY_OF_MONTH, 01);
   	 dateInstance.set(Calendar.MONTH, 10);
   	 dateInstance.set(Calendar.YEAR, 2012);
   	 
   	 Date date = dateInstance.getTime();
   	 
   	 System.out.println("Date : "+date);
   	 
    }
}
