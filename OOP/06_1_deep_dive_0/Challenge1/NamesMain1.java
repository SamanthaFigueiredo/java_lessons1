public class NamesMain1{

	public static void main(String[]args){

		String name=NameGetter1.getName();
		String surname=SurnameGetter1.getSurname();
		int age=AgeGetter1.getAge();

		System.out.print("Hello "+name+" "+ surname);
		System.out.print("\nYou are "+age+ " years old");
	}
}


// System.out.print("Hello "+NameGetter1.getName()+" "+ SurnameGetter1.getSurname());
// System.out.print("\nYou are "+AgeGetter1.getAge()+ " years old");