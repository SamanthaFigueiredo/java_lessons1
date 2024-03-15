public class Subtraction{
	public static double subtract(String op1,String op2){
		//convert strings to doubles
		double op1int=Double.parseDouble(op1);
		double op2int=Double.parseDouble(op2);

		//subtracts two operands from each other	
		return op1int - op2int ;

	}
}