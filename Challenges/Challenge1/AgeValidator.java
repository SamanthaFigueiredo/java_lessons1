import java.util.*;
import java.time.*;

public class AgeValidator{
	public static int Agecalc(String date_of_birth){

			String[] parts = date_of_birth.split("/"); //Split string array that sepeartes date string where / symbol is shown
        	String year = parts[2]; // Year part of DD/MM/YYYY
			int yearsold = 2024 - Integer.parseInt(year); // Current year minus birth year converted to int

        	return yearsold; //output shown in print

	}
}