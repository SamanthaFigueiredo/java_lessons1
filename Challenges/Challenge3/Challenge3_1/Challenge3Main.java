public class Challenge3Main{

	public static void main(String[]args){


		while(true){

			 
			boolean validdob=false;
			String dob=null;
			int i = MenuPrinter.print();
			switch(i){
			case 1:

				String name=Prompter.prompt("\nEnter your name -> ");
				String surname=Prompter.prompt("\nEnter your surname -> ");

				String email=Prompter.prompt("\nEnter your email -> ");
				while(!validdob){

				 dob=Prompter.prompt("\nEnter your date of birth (dd/mm/yyyy) -> ");
				 validdob=DateValidator.isValid(dob);
				}
				
				String id=Prompter.prompt("\nEnter your Id number -> ");
			
				UserDAO.create(name,surname,email,dob,id,String.valueOf(AgeCalculator.calculate(dob)));
				break;

			case 2:
				String deletemail=Prompter.prompt("\nEnter email -> ");
				UserDAO.delete(deletemail);
				break;
			case 3:
				String updatemail=Prompter.prompt("\nEnter email -> ");

			case 4:
				UserDAO.findAll();
				break;
			case 5:
			System.exit(0);
			}

			

		}
	}
}