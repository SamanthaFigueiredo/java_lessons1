public class VariableNames{
	public static void main (String args[]){

		//Rule 1
		System.out.println("Rule 1");
		int LetterVariable = 10;  //Will run as variable starts with a alphabet letter
		int _underscoreVariable=20; //Will run as the variable starts with an underscore
		int $DollarVariable = 30; //Will run as variable starts with a Dollar Variable
		//int 123Variable = 30; //Will not run as the variable name is not correct. INCORRECT
		

		System.out.println("Letters variable: "+LetterVariable);
		System.out.println("Underscore Variable: "+_underscoreVariable);
		System.out.println("Dollar Variable: "+$DollarVariable);


		//Rule 2
		System.out.println("Rule 2");

		int Variable12 = 12;  //Will run as variable has a digit or letter after the first letter
		int Variab12le = 10; //Will run as variable has a digit or letter after the first letter.
		//int 123Variable =30; //Will NOT RUN as te variable name cannot start witha  digit. Only after first letter.
		//int My Variable =40; //Will NOT RUN  as the variable has a space in it
		//int Variable@3 =35; //Will NOT RUN as the variable has a special character in it.

		System.out.println("Variable with digits at end: "+Variable12);
		System.out.println("Variable with digits in the middle: "+Variab12le);
		//System.out.println("Variable with Digits in wrong place: "+123Variable);
		//System.out.println("Variable with incorrect space:"+My Variable);
		//System.out.println("Variable with incorrect special character: "+Variable@3);

		//Rule 3
		System.out.println("Rule 3");

		int VariableNameisveryverylong = 13;  //Name is too long so when users type it out they can mispell the word.
		int VName = 5; //Short keyword for variable makes it easier for users to user and type out.

		System.out.println("Long variable Name: "+VariableNameisveryverylong);
		System.out.println("Short Variable Name: "+ VName);

	}
}