import java.util.*;

public class ArrayListTest8 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("mango");
        list.add("apple");
        list.add("pear");

        ArrayList<String> list2 = new ArrayList<>();
        
        list2.add("cherry");
        list2.add("plum");
       
        list2.addAll(list);
        System.out.println(list2);
        
    }
}
