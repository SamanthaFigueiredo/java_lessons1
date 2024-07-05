public class TeststartsWith{

	public static void main(String[]args){
		String sentence = "Samantha";

       
        boolean containsWord = sentence.startsWith("S");

        // Print the result
        if (containsWord) {
            System.out.println("The string starts with an S.");
        } else {
            System.out.println("The string does not start with an S.");
        }
	}
}