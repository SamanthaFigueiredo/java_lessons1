public class Challenge2Main{
	public static void main(String []args){

		String continuecalc = null;
		
        while (true) {
        	MenuPrinter mp = new MenuPrinter();
            mp.printmenu();
			String menu=Prompter.prompt("\nChoose an option number -> ");
			  MenuValidator mv = new MenuValidator();
			 boolean validmenu=mv.menunum(menu);
			 if(!validmenu){
            	continue;
            }
            String op1=Prompter.prompt("\nOperand 1 -> ");
            String operator=Prompter.prompt("Enter the operator ( + - / * % ) -> ");
            String op2=Prompter.prompt("\nOperand 2 ->");

            NumberValidator nv=new NumberValidator();
            boolean validnumbers=nv.numval(op1,op2);
			// Get the menu input from MenuPrinter
            
 			 
            mv.menuval(menu,operator,op1,op2);

			 // Get the menu input from MenuPrinter
            
            if(!validnumbers){
            	continue;
            }
            
            continuecalc = Prompter.prompt("Continue Calculations -> (Y or N)");

            if(continuecalc.equals("N")){
			break;
			}

		}



	}
}