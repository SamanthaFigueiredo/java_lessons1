public class MenuValidator {

   public static boolean menunum(String menu){
        if(menu.isEmpty()){
            System.out.println("Operation selection is blank or invalid. Please re-enter");
            return false;
        }

        if (!menu.matches("[1-5]")) {
            System.out.println("Invalid menu option. Please choose a number between 1 and 5.");
            return false;
        }
    
        // If none of the above conditions are met, return true
            return true;
    }

    public static boolean menuval(String menu,String operator,String op1, String op2) {


        switch (menu) {
            case "1":
                    
                if(!operator.equals("+")){
                    System.out.println("---Invalid Operator for chosen Operation---");
                    return false;
                    }
                else{
                    System.out.println("Addition");
                    Addition addition=new Addition();
                    addition.add(op1,op2);
                    System.out.println(op1 +"+"+op2+"="+addition.add(op1,op2));
                    }

                break;

            case "2":
                
                if(!operator.equals("-")){
                    System.out.println("---Invalid Operator for chosen Operation---");
                    return false;
                    }
                else{
                    System.out.println("Subtraction");
                    Subtraction subtraction=new Subtraction();
                    subtraction.subtract(op1,op2);
                    System.out.println(op1 +"+"+op2+"="+subtraction.subtract(op1,op2));
                    }

                break;

            case "3":
                
                if(!operator.equals("*")){
                    System.out.println("---Invalid Operator for chosen Operation---");
                    return false;
                    }
                else{
                    System.out.println("Multiplication");
                    Multiplication multiplication=new Multiplication();
                    multiplication.multiply(op1,op2);
                    System.out.println(op1 +"+"+op2+"="+multiplication.multiply(op1,op2));
                    }

                break;

            case "4":
                
                if(!operator.equals("/")){
                    System.out.println("---Invalid Operator for chosen Operation---");
                    return false;
                    }
                else{
                    System.out.println("Division");
                    Division divide=new Division();
                    divide.divide(op1,op2);
                    System.out.println(op1 +"+"+op2+"="+divide.divide(op1,op2));
                    }

                break;

            case "5":
                
                if(!operator.equals("%")){
                    System.out.println("---Invalid Operator for chosen Operation---");
                    return false;
                    }
                else{
                    System.out.println("Modulus");
                    Modulus mod=new Modulus();
                    mod.modulus(op1,op2);
                    System.out.println(op1 +"+"+op2+"="+mod.modulus(op1,op2));
                    }

                break;

            default:

                    System.out.println("Invalid Menu Option. Please choose again.");
                    return false; // Return false for invalid menu options
            }

            return true; // Return true for valid menu options
        
    }
}
