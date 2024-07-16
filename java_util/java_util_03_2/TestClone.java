import java.util.*;
public class TestClone{
	public static void main(String[]args){
		 Set<String> s = new HashSet<String>();
 
       
        s.add("Samantha");
        s.add("Fig");
       
       
          @SuppressWarnings("unchecked")
         Set<String> copy = (Set<String>) ((HashSet<String>) s).clone();
        System.out.println("Set: " + s);
        System.out.println("Copy: "+copy);
	}
}