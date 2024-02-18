import java.util.Scanner;

public class Challenge1{
	public static void main (String[]args){
		Prompt();

	}


	public static void Prompt(){
		Scanner in = new Scanner(System.in);

		System.out.println("What is your name: ");
		String name= in.nextLine();

		System.out.println("What is your surname: ");
		String surname=in.nextLine();

		System.out.println("Enter your date of birth (DD/MM/YYY): ");
		String date_of_birth=in.nextLine();

		System.out.println("How far is your favourite store from home? ");
		String distance_from_store=in.nextLine();

		System.out.println("\n");
		System.out.println("Thank you, here is your information");
		System.out.println("------------------------");
		System.out.println("Name: "+ name);
		System.out.println("Surname: "+surname);
		System.out.println("Date of birth: "+date_of_birth);
		System.out.println("Distance from store: "+distance_from_store);
	}
}