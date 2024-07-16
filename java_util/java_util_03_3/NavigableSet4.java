import java.util.*;
public class NavigableSet4{
	public static void main(String[]args){
		NavigableSet<Long> list=new TreeSet<Long>();
		list.add(5L);
		list.add(10L);
		list.add(20L);
		list.add(25L);

		System.out.print("Last value: "+list.first());

		System.out.print("Pervious value: "+list.higher(list.first()));

	}
}
