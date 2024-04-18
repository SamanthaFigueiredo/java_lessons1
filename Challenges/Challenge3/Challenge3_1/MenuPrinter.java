public class MenuPrinter{
	public static int print(){
		//Menu printed for user(options 1-4)
		while(true){
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\nSelect and option from menu below (1-5) \n" 
							+"1. Add a user \n"
							+"2. Delete a user \n"
							+"3. Update a user \n"
							+"4. List Users \n"
							+"5. Exit :(");
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


		//String menu=Prompter.prompt("\nChoose an option number (1-5) for operation -> ");

		String menu=Prompter.prompt("\nChoose an option number (1-5) for operation -> ");
		boolean validMenu = MenuValidator.menuvalid(menu);
		
            if (validMenu) {
                int menuNum = Integer.parseInt(menu);
                return menuNum; // Return the valid menu option
            }
		}

}
	
}



//int menunum=0;
//		try{
//			 menunum=Integer.parseInt(menu);
//		}
//		catch(NumberFormatException nfe){
//			//System.out.println("Invalid number , please re-enter." );
//		}
//
//		MenuValidator.menuvalid(menunum);