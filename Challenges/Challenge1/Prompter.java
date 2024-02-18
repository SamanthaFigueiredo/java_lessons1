import java.util.Scanner;

public class Prompter{
	public static void prompt(){
			Scanner in= new Scanner (System.in);
			System.out.println("What is your name: ");
			String name=in.nextLine();

			System.out.println("What is your surname: ");
			String surname=in.nextLine();

			System.out.println("What is your date of birth? (DD/MM/YYYY): ");
			String date_of_birth=in.nextLine();

			System.out.println("How far in km is your favourite store from your home? ");
  			String distance_to_store=in.nextLine();

  			



	}
}