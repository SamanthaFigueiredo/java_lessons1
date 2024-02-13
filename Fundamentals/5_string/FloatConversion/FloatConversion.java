import java.util.Scanner;

public class FloatConversion{
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);

		System.out.println("Type a float Value ->");
		String floatvalue=in.nextLine();

		float newvalue=Float.parseFloat(floatvalue);

		System.out.println(newvalue);
	}


}