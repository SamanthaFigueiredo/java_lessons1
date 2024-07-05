public class Testcontains{

	public static void main(String[]args){
		String sentence = "cat is called meow.";

       
        boolean containsWord = sentence.contains("meow");

        // Print the result
        if (containsWord) {
            System.out.println("The string contains the word 'meow'.");
        } else {
            System.out.println("The string does not contain the word 'meow'.");
        }
	}
}