public class namevalidator{
	public static boolean nameval(String name){
 		//name.equals("")
		if(name.isEmpty()){
				System.out.println("Name is blank. Please re-enter");
				return false;
			
		}else{
			
			return true;
		}
		

	}
}