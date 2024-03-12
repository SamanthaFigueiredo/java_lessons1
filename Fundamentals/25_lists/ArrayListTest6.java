import java.util.*;  
public class ArrayListTest6{

	public static void main(String []args){

		List <String> list=new ArrayList<String>();

		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		System.out.println(list.contains("Banana"));

		// for(String fruit:list)  
  		//System.out.println(fruit);  
	}
}