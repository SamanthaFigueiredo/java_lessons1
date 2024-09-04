public class Tester9{
 	public static void main(String[] args) {
        // Lambda expression implementing the sayHello method of functional interface
        FunInter greeting = (name) -> System.out.println("Hello, " + name + "!");

        // Invoke the method
        greeting.sayHello("Alice");
        greeting.sayHello("Bob");
    }
}

@FunctionalInterface
interface FunInter{
	void sayHello(String name);
}