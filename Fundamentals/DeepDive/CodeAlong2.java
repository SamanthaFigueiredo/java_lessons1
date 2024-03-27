public class CodeAlong2{

	public static void main(String[]args){
		//called method that prints values
		count();
	}

	//method count that prints numbers from 1-10
	public static void count(){
		int i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<11);
	}
}

//Alternative
//int i=1;
//		do{
//			System.out.println(i);
//			i++;
//		}while(i<=10);