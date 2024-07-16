import java.util.*;
public class TestCollection{
	public static void main(String[]args){
		List<Integer> s =new ArrayList<Integer>();
		s.add(1);
		s.add(200);
		s.add(50);
		s.add(3);
		s.add(330);
		s.add(500);
		s.add(10);

		System.out.println("Undsorted " + s);

		Collections.sort(s);
		System.out.print("Sorted "+s);

	}
}