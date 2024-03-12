import java.util.*;

public class VectorTest7 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("apple");
        v.add("cherry");
        v.add("melon");

        Vector<String> v2 = new Vector<>();
        
        v2.add("kiwi");
        v2.add("grape");
        
        v.addAll(v2);
           
        System.out.println(v);
        
    }
}
