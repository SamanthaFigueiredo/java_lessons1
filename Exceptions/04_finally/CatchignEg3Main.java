public class CatchignEg3Main {
	public static void main(String[] args) {
		try{
			CatchingEg3 myObject = new CatchingEg3();
			myObject.doSomething();
		}
		catch(Exception e){
		System.out.println("Exception caught: " + e.getMessage());
		}
		finally{
			System.out.println("Finished");	
		}
	}
}
