import java.util.Scanner;

public class BooleanConversion{
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);

		System.out.println("Type a Boolean Value ->");
		String booleanvalue=in.nextLine();

		boolean newvalue=Boolean.parseBoolean(booleanvalue);

		System.out.println(newvalue);
	}


}