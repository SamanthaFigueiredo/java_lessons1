public class FormatChecker{

	public static boolean emailcheck(String email){

		if(email.contains("@") & (email.contains(".com")||email.contains(".co.za"))){
			return true;
		}else{
			System.out.print("Invalid email present. Must contain an '@' symbol and correct extension(.com or .co.za)");
			return false;
		}
		

	}

	public static boolean idcheck(String id){

	 if (id.matches("\\d{13,14}")) {
        return true;
    } else {
        System.out.println("Invalid ID format or length!");
        return false;
    }
	}

	public static boolean namescheck(String name, String surname){
		if(name.isEmpty() || surname.isEmpty()){
			System.out.println("Blank Value. Please re-enter");
			return false;
		}else{
			return true;
		}
	}

	

}