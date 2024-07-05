public class TestendsWith{

	public static void main(String[]args){
		String sentence = "SamanthaS";

       
        boolean containsWord = sentence.endsWith("S");

        // Print the result
        if (containsWord) {
            System.out.println("The string end with an S.");
        } else {
            System.out.println("The string does not end with an S.");
        }
	}
}