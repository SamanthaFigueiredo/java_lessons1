public class NestedEx{

	NestedEx(){
		System.out.print("Constructing outer");
	}

	class Inner{

		Inner(){
			System.out.print("Constructing inner");
		}
	}
}