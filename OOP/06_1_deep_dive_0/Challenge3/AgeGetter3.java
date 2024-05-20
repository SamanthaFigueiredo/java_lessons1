import java.util.*;

public class AgeGetter3{

	public int getAge(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your age -> ");
		int getage= scan.nextInt();
		return getage;
	}
	
}


// public int getAge() {
//         Scanner scan = new Scanner(System.in);
//         int age = 0;
//         boolean validInput = false;

//         while (!validInput) {
//             System.out.print("Enter your age -> ");
//             try {
//                 age = scan.nextInt();
//                 validInput = true;
//             } catch (InputMismatchException e) {
//                 System.out.println("Invalid input! Please enter an integer.");
//                 scan.nextLine(); // Clear the invalid input from the scanner
//             }
//         }
//         return age;
//     }



