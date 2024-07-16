import java.util.*;
public class AdvancedSet2{
	public static void main(String[]args){

		 Set<Integer> s = new HashSet<Integer>();
 
        s.add(5);
        s.add(18);
        s.add(15);
        s.add(22);
        s.add(20);
       
        Iterator value = s.iterator(); 
   
        System.out.println(" Un-ordered Set: "); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 

       List<Integer> list = new ArrayList<Integer>(s);

        
        Collections.sort(list);
        System.out.print("Ordered: "+list);


	}
}
