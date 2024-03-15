import java.util.Scanner;
public class Prompter1{
	public static String prompt(String prompt){
		System.out.print(prompt);//prints prompt
		Scanner in= new Scanner (System.in); //Defined Scanner for user input
		return in.nextLine(); 

	}
}