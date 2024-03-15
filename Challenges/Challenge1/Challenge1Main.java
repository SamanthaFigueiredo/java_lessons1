public class Challenge1Main{
	public static void main (String[]args){
			String name=Prompter1.prompt("What is your name: "); //Prompts user name input
			String surname=Prompter1.prompt("What is your surname: "); //Prompts user surname input
			//while loop variable declarations
			String date_of_birth=null; 
        	boolean validDate = false; 

        	while (!validDate) { 
        		//loops input and DateValidator for correct input.
                date_of_birth=Prompter1.prompt("Enter your date of birth: (DD/MM/YYYY) ");
                //Class called,method and parameters
                DateValidator dv = new DateValidator(); 
                validDate = dv.datevalid(date_of_birth); 
       		}
			//while loop variable declarations
       	 	String distance_from_store=null;
        	boolean validnum=false; 

        	while (!validnum){
           		//loops input and NumberValidator for correct input.
                distance_from_store=Prompter1.prompt("How far is your favourite store from your home in km? ");
                //Class called,method and parameters
                NumberValidator numv=new NumberValidator();
                validnum=numv.numvalid(distance_from_store);
        	}
        	// - Class Instances and Methods called
			String NameSurname=name + " "+surname; //Concat two variables 
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