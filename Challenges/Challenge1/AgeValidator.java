import java.util.*;
import java.time.*;

public class AgeValidator{
	public static int Agecalc(String date_of_birth){

			String[] parts = date_of_birth.split("/");
        	String year = parts[2];
			int yearsold = 2024 - Integer.parseInt(year);
			
			

        		return yearsold;

    
		
	}
}