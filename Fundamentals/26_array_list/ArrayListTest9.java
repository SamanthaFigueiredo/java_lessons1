import java.util.*;

public class ArrayListTest9 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("mango");
        list.add("apple");
        list.add("pear");

        ArrayList<String> list2 = new ArrayList<>();
        
        list2.add("pear");
        list2.add("pear");
       
        
        System.out.println(list.containsAll(list2));
        
    }
}
