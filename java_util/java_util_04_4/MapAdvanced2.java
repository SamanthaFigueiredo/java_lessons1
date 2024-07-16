import java.util.*;

public class MapAdvanced2{
	public static void main(String[]args){

		Map<String,String> hm= new HashMap<String,String>();

        hm.put("a","A");
        hm.put("b","B");
        hm.put("c","C");
        hm.put("d","D");

        hm.remove("a");
        System.out.print(hm);
	}
}