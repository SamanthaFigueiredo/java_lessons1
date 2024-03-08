public class NumberValidator{


	public static boolean numval1(String op1){
		try {

			double newop1=Double.parseDouble(op1);
			
		}catch(NumberFormatException nfe){
			System.out.println("----Invalid Operands----" );
			return false;
		}
		return true;

	}

	public static boolean numval2(String op2){
		try {
			
			double newop2=Double.parseDouble(op2);

		}catch(NumberFormatException nfe){
			System.out.println("----Invalid Operands----" );
			return false;
		}
		return true;

	}
}