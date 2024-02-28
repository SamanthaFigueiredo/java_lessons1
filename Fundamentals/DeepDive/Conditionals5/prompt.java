import java.util.Scanner;
public class prompt{
	public static String prompter(String prompt){
		System.out.print(prompt);
		Scanner in=new Scanner(System.in);
		return in.nextLine();

	}
}