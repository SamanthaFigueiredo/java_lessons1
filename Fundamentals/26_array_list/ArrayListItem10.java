import java.util.*;

public class ArrayListItem10 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        
        list.add("banana");
        list.add("mango");
        list.add("apple");
        list.add("pear");

       // Getting ListIterator
        ListIterator<String> listIterator
            = list.listIterator();
 
        // Traversing elements using next() method 
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println(list);
 

        
    }
}
