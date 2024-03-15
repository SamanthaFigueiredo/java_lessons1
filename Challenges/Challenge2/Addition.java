public class Addition{
	public static double add(String op1,String op2){
			//convert strings to doubles
			double op1int=Double.parseDouble(op1);
			double op2int=Double.parseDouble(op2);

			//add two operands together
			return op1int + op2int ;
	}
}