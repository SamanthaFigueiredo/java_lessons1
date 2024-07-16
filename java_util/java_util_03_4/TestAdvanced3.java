import java.util.*;

public class TestAdvanced3 {
    public static void main(String[] args) {
        
        List<Long> linked = new LinkedList<>();
        linked.add(5L);
        linked.add(18L);
        linked.add(15L);
        linked.add(22L);
        linked.add(20L);

        
        System.out.println("Unordered Set:");
       Iterator value = linked.iterator(); 
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        
        

        // Sort the list
        Collections.sort(linked);

        // Print the sorted content of the set
        System.out.println("\nSorted Set:");
        for (Long number : linked) {
            System.out.println(number);
        }
    }
}
