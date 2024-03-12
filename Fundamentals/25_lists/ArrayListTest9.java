import java.util.*;  
public class ArrayListTest9{

	public static void main(String []args){

		List <String> list=new ArrayList<String>();

		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		List <String> list2=new ArrayList<String>();

		list2.add("Banana");
		list2.add("Banana");
		list2.add("Banana");
		list2.add("Banana");


		System.out.println(list.containsAll(list2));
			
		 

	}
}
