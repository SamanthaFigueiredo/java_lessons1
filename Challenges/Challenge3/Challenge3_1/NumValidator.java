public class NumValidator{
	public static boolean numvalid(String num){//paramters
		
		try { //Check if distance String can be successfully converted to a double
			double newnum=Double.parseDouble(num);

		}catch(NumberFormatException nfe){ //Error output for if value entered is not a number
			System.out.print("Invalid number");
			return false;//Invalid
		}
		return true;//Number is valid


	}
}