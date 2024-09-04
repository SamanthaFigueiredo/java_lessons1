import java.util.ArrayList;
import java.util.List;

public class NestedListEg {
	public static void main(String[] args) {
		
		List<List<Money>> outerList = new ArrayList<List<Money>>();
		
		List<Money> innerList = new ArrayList<Money>();
		
		innerList.add(new Money(Currency.USD, 100));
		outerList.add(innerList);
		
		List<Money> innerList2 = new ArrayList<Money>();
		innerList2.add(new Money(Currency.ZAR, 120));
		innerList2.add(new Money(Currency.ZAR, 10));
		outerList.add(innerList2);


		List<Money> innerList3 = new ArrayList<Money>();
		innerList3.add(new Money(Currency.GBP, 12));
		innerList3.add(new Money(Currency.GBP, 1));
		outerList.add(innerList3);

		System.out.println("outerList = "+outerList);
	}
}
