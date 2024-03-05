public class Challenge2Main{
	public static void main(String []args){

		String continuecalc = null;
		
        while (true) {
        	MenuPrinter mp = new MenuPrinter();
            mp.printmenu();
			String menu=Prompter.prompt("\nChoose an option number (1-5) -> ");
			MenuValidator mv = new MenuValidator();
            boolean validmenu=mv.menuval(menu);
			 // Get the menu input from MenuPrinter
            if(!validmenu){
            	continue;
            }

            String op1=Prompter.prompt("\nOperand 1 -> ");
            String op2=Prompter.prompt("\nOperand 2 ->");
            NumberValidator nv=new NumberValidator();
            boolean validnumbers=nv.numval(op1,op2);
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