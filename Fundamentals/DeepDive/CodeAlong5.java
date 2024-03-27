public class CodeAlong5{

	public static void main(String[]args){
		
		//int array with size of 25
		int[]max={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
				  20,21,22,23,24};

		//called method that prints values
		count(max);
	}

	//method count that prints numbers from 1-max
	public static void count(int[] max){

		for(int i=0;i<max.length;i++){
			System.out.println(i);

		}
	}
}


//public static void cont(int[]max){
//  for(int elementL:max){
		//System.out.println(elementL);
	//}	
//}
