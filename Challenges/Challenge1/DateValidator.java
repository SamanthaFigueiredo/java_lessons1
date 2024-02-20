import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateValidator{
	public static boolean datevalid(String date_of_birth){

        try {
            // Parse the date string
             DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate.parse(date_of_birth, dateFormatter);
           
        } catch (DateTimeParseException e) {
            // Date format is incorrect
            System.out.println("Invalid date format. Please use DD/MM/YYYY format.");
            return false;
        }
         
		return true; // Date is in the correct format
	}
}