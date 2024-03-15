public class Challenge2Main{
	public static void main(String []args){

		String continuecalc = null;
		//while loop for constant continuation of calculator program
        while (true) {
        	
        	//prints out initial menu for users to select operation
            MenuPrinter.printmenu();
            //prompt for user to enter selection
			String menu=Prompter.prompt("\nChoose an option number (1-5) for operation -> ");
			
			boolean validmenu=MenuValidator.menunum(menu);
			//while menu option entered is false, the selection will get re-prompted until they are correct.
			if(!validmenu){
            	continue;
            }

            
            boolean validnums1=false;
            String op1=null;
            //While first operator entered is false (incorrectly prompted) the user will be re-prompted.
            while (!validnums1){
            	//prompts for user to enter their first value
            	op1=Prompter.prompt("\nOperand 1 -> ");
            	//checks if number entered is valid
            	validnums1=NumberValidator.numval1(op1);

            }
            
            boolean validnums2=false;
            String op2=null;
 			//While second operator entered is false (incorrectly prompted) the user will be re-prompted.
            while(!validnums2){

				op2=Prompter.prompt("\nOperand 2 ->");
				//checks if number entered is valid
            	validnums2=NumberValidator.numval2(op2,menu);

            }
            boolean validops=false;
            String operator=null;
            //While the operator entered is false (incorrectly prompted or does not mathc operation) the user will be re-prompted.
            while(!validops){
            		operator=Prompter.prompt("Enter the operator ( + - / * % ) -> ");
            		//checks operation mathces sign and then calculates value
            		validops=MenuValidator.menuval(menu,operator,op1,op2); 
            }
             
            //prompts user for choice if they want to continue or exit
            continuecalc = Prompter.prompt("Continue Calculations -> (Any Key to continue or N to exit)");
            //if user wants to exit app then press N/n to exit
            if(continuecalc.equalsIgnoreCase("N")){
			break;
				}
			
		}
	}
}