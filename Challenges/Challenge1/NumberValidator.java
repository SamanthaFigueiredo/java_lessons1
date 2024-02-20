public class NumberValidator{
	public static boolean numvalid(String distance_from_store){
		if(distance_from_store ==null){
			return false;
		}
		try {
			double num=Double.parseDouble(distance_from_store);

		}catch(NumberFormatException nfe){
			System.out.println("Invalid number added");
			return false;
		}
		return true;


	}
}