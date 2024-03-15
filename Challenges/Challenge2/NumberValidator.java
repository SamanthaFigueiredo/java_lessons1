public class NumberValidator{

	//checks if operand (numeber) 1 is a valid number
	public static boolean numval1(String op1){
		try {
			//converts String to Double
			double newop1=Double.parseDouble(op1);
			
		}catch(NumberFormatException nfe){
			System.out.println("----Invalid Operands----" );
			return false;//gives error message if invalid
		}
		return true;//true if number is valid

	}
	//checks if operand (numeber) 2 is a valid number
	 public static boolean numval2(String op2,String menu){


        try {
        	//converts String to Double
            double newop2=Double.parseDouble(op2); 
            //checks in division if second number is 0, which is already invalid for division
            if((menu.equals("4")||menu.equals("5")) &&op2.equals("0")){
                System.out.println("You cannot divide by 0" );
                return false;//returns error message when false/invalid
            }

        }catch(NumberFormatException nfe){
            System.out.println("----Invalid Operands----" );
            return false;//gives error message if invalid, false if string isnt successfuly converted to double
        }
        return true;//true if number is valid


    }
}