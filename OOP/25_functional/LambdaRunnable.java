import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaRunnable {
   public static void main(String[] args) {
       List<String> friends =
               new ArrayList<String>(Arrays.asList("Samantha"));

        for (int i = 0; i < 10; i++) {
           friends.forEach(e -> System.out.print(e + " "));
       }
       


   }
}
