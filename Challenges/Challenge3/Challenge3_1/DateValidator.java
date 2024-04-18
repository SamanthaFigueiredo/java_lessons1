import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator{
	public static boolean isValid(String date_of_birth){//paramters
		
        try {
            // Parse the date string and check pattern
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse(date_of_birth, dateFormatter);
           
        } catch (DateTimeParseException e) {//Output if date is not valid
            // Date format is incorrect
            System.out.println("Invalid date format.Please re-enter" );
            
            return false;

        }
         
			return true; // Date is in the correct format
	}
}