import java.util.*;

public class VectorTest9 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("apple");
        v.add("cherry");
        v.add("melon");

           
             // Getting ListIterator
        ListIterator<String> listIterator
            = v.listIterator();
 
        // Traversing elements using next() method 
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println(v);

        
    }
}
