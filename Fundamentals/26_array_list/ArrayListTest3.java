import java.util.*;

public class ArrayListTest3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("mango");
        list.add("apple");
        list.add("pear");

        list.remove("apple");

           
        System.out.println(list);
        
    }
}
