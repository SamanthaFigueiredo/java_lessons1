 import java.util.ArrayList;
import java.util.List;


public class GenericsOnSteroids1 {
	public static void main(String[] args) {
		List amounts = new ArrayList();
		
		amounts.add(new Integer(1));
		amounts.add(new Integer(2));
		amounts.add(new Integer(3));
		amounts.add(new Integer(4));
		
		
		for(int i = 0; i < amounts.size();i++){
			
			Integer amount = (Integer)amounts.get(0);
			System.out.println("Position ["+i+"] amount ["+amount+"]");
		}
	}
}
