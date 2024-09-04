import java.util.stream.IntStream;

public class TestcodePoints{
	public static void main(String[]args){
		 String sentence = "Hello, World!";
        
        
         IntStream charStream = sentence.codePoints();
        
        // Print each character
        charStream.forEach(ch -> System.out.println((char) ch));
	}
}