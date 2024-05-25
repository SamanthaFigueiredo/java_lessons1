public class EnumTest1 {
	public static void main(String[] args) {
		Elements[] values = Elements.values();

		for(Elements elems:values){

			System.out.println(elems+" "+ elems.getElements());
		}
	}
}
