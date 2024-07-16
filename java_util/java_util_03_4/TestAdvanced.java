import java.util.*;

public class TestAdvanced {
    public static void main(String[] args) {
        
        Set<Long> hashSet = new HashSet<>();
        hashSet.add(5L);
        hashSet.add(18L);
        hashSet.add(15L);
        hashSet.add(22L);
        hashSet.add(20L);

        
        System.out.println("Unordered Set:");
       Iterator value = hashSet.iterator(); 
        while (value.hasNext()) {
            System.out.println(value.next());
        }

        
        List<Long> list = new ArrayList<>(hashSet);

        // Sort the list
        Collections.sort(list);

        // Print the sorted content of the set
        System.out.println("\nSorted Set:");
        for (Long number : list) {
            System.out.println(number);
        }
    }
}
