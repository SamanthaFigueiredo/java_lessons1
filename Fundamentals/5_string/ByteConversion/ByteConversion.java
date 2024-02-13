import java.util.Scanner;

public class ByteConversion{
	public static void main (String [] args){
	Scanner in = new Scanner(System.in);

		System.out.println("Type a byte Value ->");
		String bytevalue=in.nextLine();

		byte newvalue=Byte.parseByte(bytevalue);

		System.out.println(newvalue);
	}


}