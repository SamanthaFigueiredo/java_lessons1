public class SurValidator{

	public static boolean surval(String surname){
		if(surname.isEmpty()){
				System.out.println("Surname is blank. Please re-enter");
				return false;
			
		}else{
			
			return true;
		}
	}
}