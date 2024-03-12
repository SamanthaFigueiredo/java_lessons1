import java.util.*;  
public class ArrayListTest8{

	public static void main(String []args){

		List <String> list=new ArrayList<String>();

		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

		List <String> list2=new ArrayList<String>();

		list2.add("Chicken");
		list2.add("Pork");
		list2.add("Beef");
		list2.add("Fish");


		list.addAll(list2);
		System.out.println(list);
			
		 

	}
}