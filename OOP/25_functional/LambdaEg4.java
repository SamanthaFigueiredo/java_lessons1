import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaEg4 {
   public static void main(String[] args) {
       List<String> friends =
               new ArrayList<String>(Arrays.asList("1Brian", "Nate", "Neal", "Raju", "Sara", "Scott"));

       friends.sort((a,b) -> a.hashCode()-b.hashCode());

       System.out.println(friends);
   }
}
