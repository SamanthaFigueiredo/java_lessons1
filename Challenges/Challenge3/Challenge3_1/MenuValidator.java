public class MenuValidator {
    //checks if user has entered correct menu selection between 1-5
   public static boolean menuvalid(String menu){
        

        //false if user skipped or did not select an option
        if(menu.isEmpty()){
            System.out.println("Operation selection is blank or invalid. Please re-enter");
            return false;
        }
        //false if not in number range (regex)
        if (!menu.matches("[1-5]")) {
            System.out.println("Invalid menu option. Please choose a number between 1 and 5.");
            return false;
        }
    
        // If none of the above conditions are met, return true
            return true;
    }

 
}
