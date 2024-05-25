public class MorphMain{
	public static void main(String[]args){
		Morph1 morph1=new Morph1();

		Object target =null;
		//assigning the subclass to an object
		target=morph1;
		//re-assigning the tinstance back
		Morph1 inst1 = (Morph1) target;
	}
}