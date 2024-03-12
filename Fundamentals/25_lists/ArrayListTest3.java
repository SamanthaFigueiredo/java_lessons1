import java.util.*;  
public class ArrayListTest3{

	public static void main(String []args){

		List <String> list=new ArrayList<String>();

		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		list.remove("Apple");

		 for(String fruit:list)  
  		System.out.println(fruit);  
	}
}