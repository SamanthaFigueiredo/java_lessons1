import java.util.*;
public class Testaddall{
	public static void main(String[]args){

		LinkedList<String> list=new LinkedList<>();

		list.push("Samantha");
		list.push("Fig");
		list.push("Blue");


		Collection<String> collect = new ArrayList<String>(); 
      	collect.add("A"); 
      	collect.add("B"); 
      	collect.add("C"); 
      	
       System.out.println("The LinkedList is: " + list); 
                
      list.addAll(collect); 
  
     System.out.println("The new linked list is: " + list); 
	}
}