public class MilesCalculator{
	public static double milecalcs(String distance_from_store){
		
		double miles = Double.parseDouble(distance_from_store) /1.6;

		return miles;
	}
}