public class Challenge1Main{
	public static void main (String[]args){
			String name=Prompter1.prompt("What is your name: ");
			String surname=Prompter1.prompt("What is your surname: ");
			String date_of_birth=null;
        	boolean validDate = false;

        	while (!validDate) {
                date_of_birth=Prompter1.prompt("Enter your date of birth: (DD/MM/YYYY) ");
                DateValidator dv = new DateValidator();
                validDate = dv.datevalid(date_of_birth);
       		}

       	 	String distance_from_store=null;
        	boolean validnum=false;

        	while (!validnum){
           
                distance_from_store=Prompter1.prompt("How far is your favourite store from your home in km? ");
                NumberValidator numv=new NumberValidator();
                validnum=numv.numvalid(distance_from_store);
        	}

			String NameSurname=name + " "+surname;
			Printer pr=new Printer();
			
			AgeValidator ageval = new AgeValidator();
			ageval.Agecalc(date_of_birth);

			int age = AgeValidator.Agecalc(date_of_birth);

			MilesCalculator milecalc=new MilesCalculator();
			milecalc.milecalcs(distance_from_store);

			double distance = MilesCalculator.milecalcs(distance_from_store);
			
			pr.print(NameSurname,String.valueOf(age), String.valueOf(distance));

		
   		}



}