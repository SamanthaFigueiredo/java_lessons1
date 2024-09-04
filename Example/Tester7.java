public class Tester7{
	public static void main(String[]args){

	}


	// @FunctionalInterface
	// public abstract class AnnotationTest{
	// 	abstract int foo();
	// }

	// @FunctionalInterface
	// public interface AnnotationTest{
	// 	default int foo(){};
	// }

	// @FunctionalInterface
	// public interface AnnotationTest{
		
	// }

	@FunctionalInterface
	public interface Comparator<T> {
		int compareTo(T o1,T o2);
		boolean equals(Object obj);
	}

}