public class MenuValidator {
    public static boolean menuval(String menu) {
        if (menu.isEmpty()) {
            System.out.println("Operation selection is blank. Please re-enter");
            return false;
        } else {
            switch (menu) {
                case "1":
                    System.out.println("Addition");
                    break;
                case "2":
                    System.out.println("Subtraction");
                    break;
                case "3":
                    System.out.println("Multiplication");
                    break;
                case "4":
                    System.out.println("Division");
                    break;
                case "5":
                    System.out.println("Modulus");
                    break;
                default:
                    System.out.println("Invalid Menu. Please choose again.");
                    return false; // Return false for invalid menu options
            }
            return true; // Return true for valid menu options
        }
    }
}
