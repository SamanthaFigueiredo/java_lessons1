import java.util.*;
public class TestHash1{
	public static void main(String[]args){
		
		String a = new String("whatever");
        String b = new String("whatever");
        boolean res1 = a.equals(b);
        int ahash = a.hashCode(); 
        int bhash = b.hashCode(); 
        boolean res2= a.hashCode()==b.hashCode();

        System.out.println("Are the strings equal? " + res1);
        System.out.println("Hash code of string a: " + ahash);
        System.out.println("Hash code of string b: " + bhash);
        System.out.println("Are the hashcodes equals: "+res2);


	}
}