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
                case "Addition":
                    
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
                case "Subtraction":
                    System.out.println("Subtraction");
                    break;
                case "3":
                case "Multiplication":
                    System.out.println("Multiplication");
                    break;
                case "4":
                case "Division":
                    System.out.println("Division");
                    break;
                case "5":
                case "Modulus":
                    System.out.println("Modulus");
                    break;
                default:
                    System.out.println("Invalid Menu Option. Please choose again.");
                    return false; // Return false for invalid menu options
            }
            return true; // Return true for valid menu options
        

    }
}
