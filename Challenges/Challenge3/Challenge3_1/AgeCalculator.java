public class AgeCalculator{

	public static double calculate(String date_of_birth){

		//Split string array that sepeartes date string where / symbol is shown
		String[] parts = date_of_birth.split("/"); 

		// Year part of DD/MM/YYYY
        String year = parts[2]; 

        // Current year minus birth year converted to int
		double yearsold = 2024 - Double.parseDouble(year); 

        return yearsold; //output shown in print
	}
}