import java.util.*;

public class TestArraysynch{
   public static void main(String[]args){

       List<String> list = new ArrayList<String>(); 
  
            // populate the list 
            list.add("A"); 
            list.add("B"); 
            list.add("C"); 
            list.add("D"); 
            list.add("E"); 
  
            // printing the Collection 
            System.out.println("List : " + list); 

            // create a synchronized list 
            List<String> synlist = Collections .synchronizedList(list); 
  
            // printing the Collection 
            System.out.println("Synchronized list is : " + synlist); 
   }
}