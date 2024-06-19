public class NullObject {
	public void test() throws MyException {
        System.out.println("Testing");
        // Throwing the custom exception
        throw new MyException("This is my custom exception");
    }
}
