public class Challenge3Main{

	public static void main(String[]args){


		while(true){

			 
			boolean validdob=false;
			String dob=null;
			String name=null;
			String surname=null;
			String email=null;
			String id=null;
			double age=0;
			int i = MenuPrinter.print();
			switch(i){
			case 1:

				name=Prompter.prompt("\nEnter your name -> ");
				surname=Prompter.prompt("\nEnter your surname -> ");

				email=Prompter.prompt("\nEnter your email -> ");
				while(!validdob){

					dob=Prompter.prompt("\nEnter your date of birth (dd/mm/yyyy) -> ");
				 	validdob=DateValidator.isValid(dob);
				 	
				 	age=AgeCalculator.calculate(dob);
				
				}

				id=Prompter.prompt("\nEnter your Id number -> ");
			
				UserDAO.create(name,surname,email,dob,id,String.valueOf(age));
				break;

			case 2:
				String deletemail=Prompter.prompt("\nEnter email -> ");
				UserDAO.delete(deletemail);
				break;
			case 3:
				String updatemail=Prompter.prompt("\nEnter email -> ");
				UserDAO.update(name,surname,updatemail,dob,id,String.valueOf(age));

			case 4:
				UserDAO.findAll();
				break;
			case 5:
				String getuser=Prompter.prompt("\nEnter email to get user -> ");
				UserDAO.getUserByEmail(getuser);
				break;
			case 6:
				System.exit(0);
				break;
			}

			

		}
	}
}