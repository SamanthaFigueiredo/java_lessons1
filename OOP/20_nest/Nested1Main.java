public class Nested1Main {
	public static void main(String[] args) {

		Nested1 outerInstance=new Nested1();

		Nested1.Inner Inner = outerInstance.new Inner();
	}
}




