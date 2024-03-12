import java.util.*;

public class VectorTest8 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("apple");
        v.add("cherry");
        v.add("melon");

        Vector<String> v2 = new Vector<>();
        
        v2.add("cherry");
        v2.add("cherry");
        
        
           
        System.out.println(v.containsAll(v2));
        
    }
}
