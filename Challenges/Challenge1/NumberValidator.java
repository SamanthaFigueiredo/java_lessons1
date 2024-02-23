public class NumberValidator{
	public static boolean numvalid(String distance_from_store){
		
		try {
			double num=Double.parseDouble(distance_from_store);

		}catch(NumberFormatException nfe){
			System.out.println("Invalid number added.Exiting..." + nfe);
			return false;
		}
		return true;


	}
}