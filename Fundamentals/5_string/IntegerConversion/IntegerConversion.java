import java.util.Scanner;

public class IntegerConversion{
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);

		System.out.println("Type an integer ->");
		String intvalue=in.nextLine();

		int newvalue=Integer.parseInt(intvalue);

		System.out.println(newvalue);
	}


}