import java.util.*;

public class VectorTest2 {
    public static void main(String[] args) {

        Vector<String> v = new Vector<>();
        
        v.add("banana");
        v.add("apple");
        v.add("cherry");
        v.add("melon");

           v.remove("melon");
            System.out.println(v);
        
    }
}
