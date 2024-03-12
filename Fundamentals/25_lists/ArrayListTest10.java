import java.util.*;  
public class ArrayListTest10{

	public static void main(String []args){

		List <String> list=new ArrayList<String>();

		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		
  	// Getting ListIterator
        ListIterator<String> listIterator
            = list.listIterator();
 
        // Traversing elements using next() method 
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
 
        // for-each loop creates Internal Iterator here.
        for (String s : list) {
            System.out.println(s);
        }
	}
}