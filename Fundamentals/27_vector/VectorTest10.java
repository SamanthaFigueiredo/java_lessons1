import java.util.*;

public class VectorTest10 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("apple");
        v.add("cherry");
        v.add("melon");

           
    Object[] arr = v.toVector();
    System.out.println(arr[0]); 

    }
}
