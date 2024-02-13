import java.util.Scanner;

public class ShortConversion{
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);

		System.out.println("Type a short Value ->");
		String shortvalue=in.nextLine();

		short newvalue=Short.parseShort(shortvalue);

		System.out.println(newvalue);
	}


}