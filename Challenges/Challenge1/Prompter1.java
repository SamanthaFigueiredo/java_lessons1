import java.util.Scanner;
public class Prompter1{
	public static String prompt(String prompt){
		System.out.print(prompt);
		Scanner in= new Scanner (System.in);
		return in.nextLine();

	}
}