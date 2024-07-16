import java.util.*;
public class TestContainsAll{
	public static void main(String[]args){

		LinkedList<String> list=new LinkedList<>();

		list.push("Samantha");
		list.push("Fig");
		list.push("Blue");


		Collection<String> collect = new ArrayList<String>(); 
      	collect.add("Samantha"); 
      	collect.add("Fig"); 
      	collect.add("Blue"); 
      	
       System.out.println("Does the new list contain equal elements: " + list.containsAll(collect)); 
                
     
	}
}