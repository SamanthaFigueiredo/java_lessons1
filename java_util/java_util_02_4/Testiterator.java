import java.util.*;
public class Testiterator{
	public static void main(String[]args){

		LinkedList<String> list=new LinkedList<>();

		list.push("Samantha");
		list.push("Fig");
		list.push("Blue");


		ListIterator list_Iter = list.listIterator(1); 
  
      
        while(list_Iter.hasNext()){ 
           System.out.println(list_Iter.next()); 
        } 
                
     
	}
}