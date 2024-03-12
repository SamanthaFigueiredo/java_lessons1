import java.util.*;  
public class ArrayListTest5{

	public static void main(String []args){

		List <String> list=new ArrayList<String>();

		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		System.out.println(list.size());

		 for(String fruit:list)  
  		System.out.println(fruit);  
	}
}