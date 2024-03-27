public class CodeAlong4{

	public static void main(String[]args){
		//called method that prints values
		int max=15;
		count(max);
	}

	//method count that prints numbers from 1-max
	public static void count(int max){

		for(int i=1;i<max;i++){
			System.out.println(i);
		}
	}
}

//Alternative
//for(int i=1;i<=10;i++){
//			System.out.println(i);
//		}