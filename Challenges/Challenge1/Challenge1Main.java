public class Challenge1Main{
	public static void main (String[]args){

			System.out.println("What is your name: ");
			String name=Prompter1.prompt();

			System.out.println("What is your surname: ");
			String surname=Prompter1.prompt();

			System.out.println("Enter your date of birth: (DD/MM/YYYY) ");
			String date_of_birth=Prompter1.prompt();

			System.out.println("How far is your favourite store from your home in km? ");
			String distance_from_store=Prompter1.prompt();
			
			//DateValidator dv = new DateValidator();
			//dv.datevalid(date_of_birth);


			String NameSurname=name + " "+surname;
			Printer pr=new Printer();
			pr.print(NameSurname);


		
   		}



}