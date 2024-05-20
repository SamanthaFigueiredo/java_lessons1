import java.util.Scanner;
public class SurnameGetter3{

	public String getSurname(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your surname -> ");
		String getsurname= scan.nextLine();
		return getsurname;
	}
}

