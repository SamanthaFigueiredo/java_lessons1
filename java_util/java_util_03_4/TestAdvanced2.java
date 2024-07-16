import java.util.*;

public class TestAdvanced2 {
    public static void main(String[] args) {
        
        List<Long> vectors = new Vector<>();
        vectors.add(5L);
        vectors.add(18L);
        vectors.add(15L);
        vectors.add(22L);
        vectors.add(20L);

        
        System.out.println("Unordered Set:");
       Iterator value = vectors.iterator(); 
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        
        

        // Sort the list
        Collections.sort(vectors);

        // Print the sorted content of the set
        System.out.println("\nSorted Set:");
        for (Long number : vectors) {
            System.out.println(number);
        }
    }
}
