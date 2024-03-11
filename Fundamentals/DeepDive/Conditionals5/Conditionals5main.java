public class Conditionals5main{
	public static void main(String []args){
		 
		 
		//String surname=null;
		//String grade=null;
		String name=null;
		boolean validname=false;
			while(!validname){
				name=prompt.prompter("What is your name : ");
				namevalidator nv=new namevalidator();
				validname=nv.nameval(name);
			}
		

		String surname=null;
		boolean validsurname=false;
			while(!validsurname){
				surname=prompt.prompter("What is your surname : ");
				SurValidator sv=new SurValidator();
				validsurname=sv.surval(surname);
			}
		

		
		String grade=null;
		boolean validgrade=false;
			while(!validgrade){
				grade = prompt.prompter("What grade are you in : ");
				Gradevalidator gv= new Gradevalidator();
				validgrade=gv.gradeval(grade);


			}


	
		 String ClassTeacher=null;
        String PETeacher=null;

        switch(grade){
            case "1":
                ClassTeacher="Mrs Jones";
                PETeacher="Mr Roberts";
                break;

            case "2":
                ClassTeacher="Mr Swan";
                PETeacher="Mr Roberts";
                break;

            case "3":
                ClassTeacher="Mrs Jamie";
                PETeacher="Mr Roberts";
                break;

            case "4":
                ClassTeacher="Mrs Jackson";
                PETeacher="Mr Stevens";
                break;

            case "5":
                ClassTeacher="Mrs Lane";
                PETeacher="Mr Stevens";
                break;

            case "6":
                ClassTeacher="Mrs Brett";
                PETeacher="Mr Stevens";
                break;

            case "7":
                ClassTeacher="Mrs Shane";
                PETeacher="Mr Stevens";
                break;

            case "8":
                ClassTeacher="Mr Zee";
                PETeacher="Mrs Rodgers";
                break;

            case "9":
                ClassTeacher="Mr Nell";
                PETeacher="Mrs Rodgers";
                break;

            case "10":
                ClassTeacher="Mrs Baretta";
                PETeacher="Mr Lyle";
                break;

            case "11":
                ClassTeacher="Mr Cane";
                PETeacher="Mr Lyle";
                break;

            case "12":
                ClassTeacher="Mr Lamone";
                PETeacher="Mr Lyle";
                break;

            default:
                System.out.println("Invalid grade!!!");
        }


		String NameSurname=name + " "+surname;

		print pr=new print();

		pr.printer(NameSurname, grade,ClassTeacher,PETeacher);
		
	}
}