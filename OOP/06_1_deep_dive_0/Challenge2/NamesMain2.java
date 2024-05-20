public class NamesMain2{

	public static void main(String[]args){
		NameGetter2 ng=new NameGetter2();
		SurnameGetter2 sg=new SurnameGetter2();
		AgeGetter2 ag=new AgeGetter2();

		String name=ng.getName();
		String surname=sg.getSurname();
		int age=ag.getAge();

		System.out.print("Hello "+name+" "+ surname);
		System.out.print("\nYou are "+age+ " years old");
	}
}


// public class NamesMain2{

// 	public static void main(String[]args){
		
// 		AgeGetter2 ag=new AgeGetter2();

		

// 		System.out.print("Hello "+ag.getName()+" "+ ag.getSurname());
// 		System.out.print("\nYou are "+ag.getAge()+ " years old");
// 	}
// }