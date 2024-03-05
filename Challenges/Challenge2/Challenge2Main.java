public class Challenge2Main{
	public static void main(String []args){

		String continuecalc = null;
		
        while (true) {
        	MenuPrinter mp = new MenuPrinter();
            mp.printmenu();
			String menu=Prompter.prompt(" \n Choose an option -> ");
			MenuValidator mv = new MenuValidator();
            boolean validmenu=mv.menuval(menu);
			 // Get the menu input from MenuPrinter
            if(!validmenu){
            	continue;
            }

            
            continuecalc = Prompter.prompt("Continue Calculations -> (Y or N)");

            if(continuecalc.equals("N")){
			break;
			}

		}



	}
}