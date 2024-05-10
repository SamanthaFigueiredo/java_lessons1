public class MenuValidator {
    //checks if user has entered correct menu selection between 1-5
   public static boolean menunum(String menu){

        //false if user skipped or did not select an option
        if(menu.isEmpty()){
            System.out.println("Operation selection is blank or invalid. Please re-enter");
            return false;
        }
        //false if not in number range
        if (!menu.matches("[1-5]")) {
            System.out.println("Invalid menu option. Please choose a number between 1 and 5.");
            return false;
        }
    
        // If none of the above conditions are met, return true
            return true;
    }


    //method checks if operator entered is same as chosen operation and calculates
    public static boolean menuval(String menu,String operator,String op1, String op2) {

        //checks menu selection (1-5)
        switch (menu) {
                //Addition
            case "1":
                    //checks addition sign
                if(!operator.equals("+")){

                    System.out.println("---Invalid Operator for chosen Operation---");
                    return false;//if the sign entered is invalid, they will re-prompt the sign

                    }
                else{

                    double result= Addition.add(op1,op2);
                    Printer.print(op1, operator, op2, String.valueOf(result));

                    }
                //ends case statement
                break;
                //Subtraction       
            case "2":
                    //checks subtraction sign
                if(!operator.equals("-")){

                    System.out.println("---Invalid Operator for chosen Operation---");
                    return false;//if the sign entered is invalid, they will re-prompt the sign
                    }
                else{

                    double result=Subtraction.subtract(op1,op2);
                    Printer.print(op1, operator, op2, String.valueOf(result));

                    }
                //ends case statement
                break;
                //Multiplication
            case "3":
                    //checks multiplication sign
                if(!operator.equals("*")){

                    System.out.println("---Invalid Operator for chosen Operation---");
                    return false;//if the sign entered is invalid, they will re-prompt the sign

                    }
                else{

                    double result=Multiplication.multiply(op1,op2);
                    Printer.print(op1, operator, op2, String.valueOf(result));

                    }
                //ends case statement 
                break;
            //Division    
            case "4":
                    //checks division sign
                if(!operator.equals("/")){

                    System.out.println("---Invalid Operator for chosen Operation---");
                    return false;//if the sign entered is invalid, they will re-prompt the sign

                    }
                else{

                    double result= Division.divide(op1,op2);
                    Printer.print(op1, operator, op2, String.valueOf(result));

                    }
                //ends case statement
                break;
            //Modulus        
            case "5":
                    //checks modulus statement
                if(!operator.equals("%")){

                    System.out.println("---Invalid Operator for chosen Operation---");
                    return false;//if the sign entered is invalid, they will re-prompt the sign

                    }
                else{

                    double result=Modulus.modulus(op1,op2);
                    Printer.print(op1, operator, op2, String.valueOf(result));

                    }
                //ends case statment
                break;
                //output message for if none of above options are correct
            default:

                    System.out.println("Invalid Menu Option. Please choose again.");
                    return false; // Return false for invalid menu options
            }

            return true; // Return true for valid menu options
        
    }
}
