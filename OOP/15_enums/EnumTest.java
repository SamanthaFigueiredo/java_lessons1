public class EnumTest {
	public static void main(String[] args) {
		Elements elem1 = Elements.HYDROGEN;
		Elements elem2 = Elements.HELIUM;
		 
		boolean res1 = elem1.equals(elem2);
		 
		System.out.println(elem1+" equals "+elem2+" is "+res1);
 
	}
 
}
