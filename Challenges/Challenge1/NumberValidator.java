public class NumberValidator{
	public static boolean numvalid(String distance_from_store){//paramters
		
		try { //Check if distance String can be successfully converted to a double
			double num=Double.parseDouble(distance_from_store);

		}catch(NumberFormatException nfe){ //Error output for if value entered is not a number
			System.out.println("Invalid number , please re-enter." + nfe);
			return false;//Invalid
		}
		return true;//Number is valid


	}
}