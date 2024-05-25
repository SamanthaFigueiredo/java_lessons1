public class GarbageMain{
	public static void main(String[]args){
		    for (int i = 1; i <= 5; i++) {
            Garbage gb = new Garbage("Garbage" + i);
        }

        // Run the garbage collector manually
        System.gc();

        // Create another 5 objects
        for (int i = 6; i <= 10; i++) {
            Garbage gb = new Garbage("Garbage" + i);
        }

        // Run the garbage collector again
        System.gc();
    }
		
	}
