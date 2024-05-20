public class NamesMain3{

	public static void main(String[]args){
		NameGetter3 ng=new NameGetter3();
		SurnameGetter3 sg=new SurnameGetter3();
		AgeGetter3 ag=new AgeGetter3();

		String name=ng.getName();
		String surname=sg.getSurname();
		int age=ag.getAge();

		System.out.print("Hello "+name+" "+ surname);
		System.out.print("\nYou are "+age+ " years old");
	}
}