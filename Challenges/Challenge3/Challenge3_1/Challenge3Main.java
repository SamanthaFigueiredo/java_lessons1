public class Challenge3Main{

	public static void main(String[]args){


		while(true){

			boolean validemail = false;
			boolean validdob=false;
			boolean validemail0=false;
			boolean validid=false;
			boolean validinput=false;
			String dob=null;
			String name=null;
			String surname=null;
			String email=null;
			String id=null;
			double age=0;
			int i = MenuPrinter.print();


			switch(i){
			case 1:
				while(!validinput){
					name=Prompter.prompt("\nEnter your name -> ");
					surname=Prompter.prompt("\nEnter your surname -> ");
					validinput=FormatChecker.namescheck(name,surname);
				}
				
				while(!validemail0){
					email=Prompter.prompt("\nEnter your email -> ");
					validemail0=(FormatChecker.emailcheck(email)&UserDAO.checkemaildup(email));

				
					

				}
				

				while(!validdob){

					dob = Prompter.prompt("\nEnter your date of birth (dd/mm/yyyy) -> ");
            		validdob = DateValidator.isValid(dob);
            	if (validdob) {
            		age = AgeCalculator.calculate(dob);
            		} 
				}

				while(!validid){
					id=Prompter.prompt("\nEnter your Id number -> ");
					validid=FormatChecker.idcheck(id);
				}
				

				

				
            	UserDAO.create(name,surname,email,dob,id,String.valueOf(age));				
				break;

			case 2:
				while(!validemail){
					String deletemail=Prompter.prompt("\nEnter email you want to delete -> ");
					validemail=UserDAO.checkemail(deletemail);
					UserDAO.delete(deletemail);
				}
				
				break;

			case 3:
					String updatemail=Prompter.prompt("\nEnter user's email you want to update -> ");
					
					UserDAO.update(name,surname,updatemail,dob,id,String.valueOf(age));
				
				
				break;

			case 4:

				UserDAO.findAll();
				break;

			case 5:
				while(!validemail){
					String getuser=Prompter.prompt("\nEnter user's email you want to retrieve -> ");
					validemail=UserDAO.checkemail(getuser);
					UserDAO.getUserByEmail(getuser);
				}
				
				break;

			case 6:
				System.exit(0);
				break;

			}

			

		}
	}
}