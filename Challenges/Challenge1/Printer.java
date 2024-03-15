public class Printer{
	//Greeting for user

public static void print(String NameSurname, String age, String distance ){//paramaters


	System.out.println("\n---------------------------------\n");
		System.out.print("Hello "+NameSurname);  //Username and surname

		System.out.println("\nYou are "+age+" years old. "); //Calculated age ( AgeValidator)

		int agesec= Integer.parseInt(age)*86400; //Age in seconds

		System.out.println("Age in seconds: " +agesec); 

		System.out.println("Age in millieseconds: "+agesec*1000); //Age in millieseconds

		int ageint=Integer.parseInt(age); //String converted to int
		String binaryString=String.format(Integer.toBinaryString(ageint)); //age in binary

        System.out.println("Age in Binary: "+binaryString);
        System.out.println("Age in Hexadecimals: "+String.format(Integer.toHexString(ageint))); //age in hexadecimals

		System.out.println("Distance in meters (converted from miles) : "+distance +" m"); //distance in miles -> meters



	System.out.println("\n---------------------------------");	



	}
}