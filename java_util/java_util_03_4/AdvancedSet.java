import java.util.*;
public class AdvancedSet{
	public static void main(String[]args){

		 Set<Long> s = new HashSet<Long>();
 
        s.add(5L);
        s.add(18L);
        s.add(15L);
        s.add(22L);
        s.add(20L);
       
        Iterator value = s.iterator(); 
   
        System.out.println(" Un-ordered Set: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 

       List<Long> list = new ArrayList<Long>(s);

        
        Collections.sort(list);
        System.out.print("Ordered: "+list);


	}
}
