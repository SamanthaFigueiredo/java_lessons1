 public class ClassCastTest {
	public static void main(String[] args) {
		
		Exception exception = new Exception();
		
		System.out.println("Step 1");
		
		Exception exception2 = (Exception)exception;
		
		System.out.println("Step 2");
	}
}
