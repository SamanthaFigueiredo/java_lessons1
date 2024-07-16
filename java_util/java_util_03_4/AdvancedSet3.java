import java.util.*;
public class AdvancedSet3{
	public static void main(String[]args){

		 Set<String> s = new HashSet<String>();
 
        s.add("F");
        s.add("B");
        s.add("D");
        s.add("C");
        s.add("E");
       
        Iterator value = s.iterator(); 
   
        System.out.println(" Un-ordered Set: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 

       List<String> list = new ArrayList<String>(s);

        
        Collections.sort(list);
        System.out.print("Ordered: "+list);


	}
}
