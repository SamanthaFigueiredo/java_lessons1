public class CatchingEg2Main {
	public static void main(String[] args) {

		try{
			CatchingEg2 myObject = new CatchingEg2();
			myObject.doSomething();
		}
		catch(Exception e){
		System.out.println("Finished");
		}
	}
}
