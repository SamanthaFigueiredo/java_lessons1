public class Modulus{
	public static double modulus(String op1,String op2){
		//convert strings to doubles
		double op1int=Double.parseDouble(op1);
		double op2int=Double.parseDouble(op2);

		//multiplies two operands together
		return op1int % op2int ;

	}
}