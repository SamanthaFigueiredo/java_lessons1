import java.util.*;  
public class ArrayListTest11{

	public static void main(String []args){

		List <String> list=new ArrayList<String>();

		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");

 	Object[] arr = list.toArray();
    System.out.println(arr[0]); 
	}
}