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

            NumberValidator nv=new NumberValidator();
            boolean validnums1=false;
            String op1=null;

            while (!validnums1){

            	op1=Prompter.prompt("\nOperand 1 -> ");
            	validnums1=nv.numval1(op1);

            }
            
            boolean validnums2=false;
            String op2=null;

            while(!validnums2){

				op2=Prompter.prompt("\nOperand 2 ->");
            	validnums2=nv.numval2(op2);

            }
            
            String operator=Prompter.prompt("Enter the operator ( + - / * % ) -> ");
            boolean validop=mv.menuval(menu,operator,op1,op2);            
         	if(!validop){
            	continue;
            }
            continuecalc = Prompter.prompt("Continue Calculations -> (Y or N)");

            if(continuecalc.equals("N")){
			break;
			}

		}
	}
}