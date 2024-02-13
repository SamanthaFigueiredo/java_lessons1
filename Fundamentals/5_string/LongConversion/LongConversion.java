import java.util.Scanner;

public class LongConversion{
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);

		System.out.println("Type a long Value ->");
		String longvalue=in.nextLine();

		long newvalue=Long.parseLong(longvalue);

		System.out.println(newvalue);
	}


}