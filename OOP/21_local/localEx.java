public class localEx{

	 static {
        System.out.println("Static initializer block");
    }

    // Instance initializer block
    {
        System.out.println("Instance initializer block");
    }

    // Constructor
    public localEx() {
        System.out.println("Constructor");
    }

    // Method
    public void exampleMethod() {
        System.out.println("Method");

        // Ordinary block within the method
        {
            System.out.println("Ordinary block within the method");
        }

        
    }
	public static void main(String[]args){
			localEx example = new localEx();
        	example.exampleMethod();
	}
}