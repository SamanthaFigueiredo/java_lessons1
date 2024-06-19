
public class NullTest {

	static NullObject nullObject;
	
	public static void main(String[] args) {
		System.out.println("Start");
		nullObject = new NullObject();
		nullObject.test();
		System.out.println("Finished");
	}

}
