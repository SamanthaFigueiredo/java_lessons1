import java.util.*;
public class TestClear{
	public static void main(String[]args){

		LinkedList<String> list=new LinkedList<>();

		list.push("Samantha");
		list.push("Fig");

		list.clear();

		System.out.print(list);
	}
}