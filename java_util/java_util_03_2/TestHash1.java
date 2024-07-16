import java.util.*;
public class TestHash1{
	public static void main(String[]args){

		 Set<String> s = new HashSet<String>();
 
       
        s.add("Samantha");
        s.add("Fig");
       
       
        
        System.out.println("Set: " + s);

         Iterator value = s.iterator(); 
  
        
        System.out.println("The iterator values are: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 
	}
}