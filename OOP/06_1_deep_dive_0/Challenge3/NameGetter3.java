import java.util.Scanner;

public class NameGetter3{

	public String getName(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your name -> ");
		String getname= scan.nextLine();
		return getname;
	}
}