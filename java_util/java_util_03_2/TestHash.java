import java.util.HashSet;
import java.util.Set;

public class TestHash {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("Samantha");
        s.add("Fig");

        
        for (String element : s) {
            System.out.println("One element from the set: " + element);
            break; 
        }

        System.out.println("Set: " + s);
    }
}
