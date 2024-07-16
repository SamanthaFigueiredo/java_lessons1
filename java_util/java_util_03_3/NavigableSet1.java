import java.util.*;
public class NavigableSet1{
	public static void main(String[]args){
		NavigableSet<Long> list=new TreeSet<Long>();
		list.add(10L);
		list.add(20L);
		list.add(5L);
		list.add(25L);

		System.out.print(list.last());
	}
}