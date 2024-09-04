public class Tester2{
	public static void main(String[]args){

	}
}
interface CanFly{
	String type="A";
	void fly();

default String getType(){
	return type;
}
}



abstract class Name{
default void print(){
	
}
}