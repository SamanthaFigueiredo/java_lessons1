public class ExampleMain{

	public static void main(String[]args){
		NestedEx outerInstance=new NestedEx();

		
		NestedEx.Inner Inner = outerInstance.new Inner();


	}
}