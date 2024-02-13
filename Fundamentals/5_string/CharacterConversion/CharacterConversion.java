import java.util.Scanner;

public class CharacterConversion{
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);

		System.out.println("Type a char Value ->");
		String charvalue=in.nextLine();

		char newvalue=charvalue.charAt(0);

		System.out.println(newvalue);
	}


}