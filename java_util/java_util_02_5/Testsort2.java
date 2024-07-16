import java.util.*;
public class Testsort2{
	public static void main(String[]args){

		  Vector<Long> list = new Vector<Long>(); 
  
            // populate the list 
            list.add(10L); 
            list.add(2L); 
            list.add(39L); 
            list.add(20L); 
            list.add(1231L); 

            Collections.sort(list);

            System.out.print(list);
	}
}