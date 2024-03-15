public class MilesCalculator{
	public static double milecalcs(String distance_from_store){
		
		double miles = Double.parseDouble(distance_from_store) /1.6; //String distance converted to double and converted to miles

		double milesmeter= miles*1609.344; //Miles -> meters

		return milesmeter; //output for print 
	}
}