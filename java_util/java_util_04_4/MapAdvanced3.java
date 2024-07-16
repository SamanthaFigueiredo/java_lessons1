import java.util.*;

public class MapAdvanced3{
	public static void main(String[]args){

		Map<String,String> hm= new HashMap<String,String>();

        hm.put("a","A");
        hm.put("b","B");
        hm.put("c","C");
        hm.put("d","D");

        
        System.out.println("Map "+hm);

        hm.clear();
        System.out.println("Cleared Set "+hm);
	}
}