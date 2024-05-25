package package1;

public class Parent{

	protected static void family(){
		System.out.println("I am a parent");
	}

	public static void myMethod1(){
		System.out.println("I belong here!");
	}
 public Parent() {
        // Default constructor logic here
    }
	 public Parent(int a, int b) throws NumberFormatException{
		System.out.println("I am a Parent constructor");
	}
}