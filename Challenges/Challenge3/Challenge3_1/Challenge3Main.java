public class Challenge3Main{

	public static void main(String[]args){
		UserDAOfile.readFromFile();
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
				UserDAOfile.readFromFile();
				while(!validinput){
					name=Prompter.prompt("\nEnter your name -> ");
					surname=Prompter.prompt("\nEnter your surname -> ");
					validinput=FormatChecker.namescheck(name,surname);

				}
				
				while(!validemail0){
					email=Prompter.prompt("\nEnter your email -> ");
					validemail0=(FormatChecker.emailcheck(email)&UserDAOfile.checkemaildup(email));

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
				

				

				
            	UserDAOfile.create(name,surname,email,dob,id,String.valueOf(age));

				break;

			case 2:
				while(!validemail){
					String deletemail=Prompter.prompt("\nEnter email you want to delete -> ");
					validemail=UserDAOfile.checkemail(deletemail);
					UserDAOfile.delete(deletemail);
				}
				
				break;

			case 3:
					String updatemail=Prompter.prompt("\nEnter user's email you want to update -> ");
					
					UserDAOfile.update(name,surname,updatemail,dob,id,String.valueOf(age));
				
					
				break;

			case 4:

				UserDAOfile.findAll();
				break;

			case 5:
				while(!validemail){
					String getuser=Prompter.prompt("\nEnter user's email you want to retrieve -> ");
					validemail=UserDAOfile.checkemail(getuser);
					UserDAOfile.getUserByEmail(getuser);
				}
				
				break;

			case 6:
				System.exit(0);
				break;

			}

			

		}
	}
}