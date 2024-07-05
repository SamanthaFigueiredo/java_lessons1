public class Testequals{

	public static void main(String[]args){
		String sentence = "SamanthaS";

       
        boolean containsWord = sentence.equals("SamanthaS");

        // Print the result
        if (containsWord) {
            System.out.println("The string equals SamanthaS.");
        } else {
            System.out.println("The string does not equal SamanthaS.");
        }
	}
}