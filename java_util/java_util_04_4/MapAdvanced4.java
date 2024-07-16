import java.util.*;

public class MapAdvanced4{
	public static void main(String[]args){

		Map<String,String> hm= new HashMap<String,String>();

        hm.put("a","A");
        hm.put("b","B");
        hm.put("c","C");
        hm.put("d","D");

        
        System.out.println("Map1 "+hm);


        Map<String,String> hm2=new HashMap<String,String>();
        hm2.put("e","E");
        hm2.put("f","F");
        hm2.put("g","G");

        System.out.println("Map2: "+hm2);
        Map<String,String> hm3 = new HashMap<String,String>(hm);
        hm3.putAll(hm2);
        System.out.println("Combined set"+hm3);
	}
}