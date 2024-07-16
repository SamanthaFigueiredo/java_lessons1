import java.util.*;
public class TestPop{
	public static void main(String[]args){

		LinkedList<String> list=new LinkedList<>();

		list.push("Samantha");
		list.push("Fig");

		list.pop();

		System.out.print(list);
	}
}