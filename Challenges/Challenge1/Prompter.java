import java.util.Scanner;


public class Prompter{

	public static String prompt(){

		String name,surname,date_of_birth,distance_to_store,NameSurname;

			Scanner in= new Scanner (System.in);
			System.out.println("What is your name: ");
			name=in.nextLine();

			System.out.println("What is your surname: ");
			surname=in.nextLine();

			System.out.println("What is your date of birth? (DD/MM/YYYY): ");
			date_of_birth=in.nextLine();

			System.out.println("How far in km is your favourite store from your home? ");
  			distance_to_store=in.nextLine();

  			NameSurname = name + " "+ surname;

			return name + "|" + surname + "|" + date_of_birth + "|" + distance_to_store;
  			  
	}
}