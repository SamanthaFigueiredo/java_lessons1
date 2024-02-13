import java.util.Scanner;

public class DoubleConversion{
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);

		System.out.println("Type a double Value ->");
		String doublevalue=in.nextLine();

		double newvalue=Double.parseDouble(doublevalue);

		System.out.println(newvalue);
	}


}