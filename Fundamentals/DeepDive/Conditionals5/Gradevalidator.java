public class Gradevalidator{
	public static boolean gradeval(String grade){

		
		if(grade.isEmpty()){
			System.out.println("Grade is Blank..Please enter a grade");
			return false;
		}


		int newgrade=Integer.parseInt(grade);
		if(newgrade >=1 && newgrade <=12){
				return true;
			}else{
				System.out.println("Please enter a valid Grade between the range of 1 and 12");
				return false;
				
			}



	}
}