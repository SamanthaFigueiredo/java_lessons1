import java.util.Scanner;

public class Prompter{
	public static String prompt(String prompt){

		//prints the prompt for the user to enter their information
		System.out.println(prompt);
		//initialises app allowing user to enter their own information
		Scanner in=new Scanner(System.in);
		return in.nextLine();
		
	}
}