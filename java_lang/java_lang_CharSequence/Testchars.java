import java.util.stream.IntStream;

public class Testchars{
	public static void main(String[]args){
		 String sentence = "Hello, World!";
        
        
         IntStream charStream = sentence.chars();
        
        // Print each character
        charStream.forEach(ch -> System.out.println((char) ch));
	}
}