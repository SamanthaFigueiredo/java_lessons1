public class Tester5{
	public static void main(String[]args){
		DoNothing beldle=()-> System.out.print("be idle");
		beldle.doNothing();
	}
}

interface DoNothing{
default void doNothing(){System.out.print("doNothing");}
}

@FunctionalInterface
interface DontDoAnything extends DoNothing{
	@Override
	abstract void doNothing();
}