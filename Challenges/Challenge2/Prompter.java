import java.util.Scanner;

public class Prompter{
	public static String prompt(String prompt){
			System.out.println(prompt);
			Scanner in=new Scanner(System.in);
			return in.nextLine();
	}
}