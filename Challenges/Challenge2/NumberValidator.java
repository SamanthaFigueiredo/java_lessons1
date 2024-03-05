public class NumberValidator{
	public static boolean numval(String op1, String op2){
		try {
			double newop1=Double.parseDouble(op1);
			double newop2=Double.parseDouble(op2);

		}catch(NumberFormatException nfe){
			System.out.println("Invalid Operands" );
			return false;
		}
		return true;

	}
}