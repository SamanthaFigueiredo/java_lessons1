import java.util.Scanner;
public class Concatenate{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);

		System.out.println("Type a sentence ->");
		String sentence1=in.nextLine().trim();

		System.out.println("Type a sentence ->");
		String sentence2=in.nextLine().trim();

		String newsentence = sentence1+ "\n"+sentence2;

		System.out.println(newsentence);
	}
}