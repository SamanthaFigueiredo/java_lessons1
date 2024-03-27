import java.util.Random;

public class CodeAlong7{
	public static void main(String[]args){
		//initial array-size 100
		int []arr=new int[100];

		//sub array - size 17 32-15
		int []subarr=new int[17];
		Random random = new Random();

		//populate array
		for(int i=0;i<arr.length;i++){
			arr[i]=random.nextInt(100);
		}

		printarray(arr);
		//(initial array, begining position in arr, new array, starting point of new array, length of taken values from arr )
		System.arraycopy(arr,15,subarr,0,17);
		printarray(subarr);
	}

	//array to print the specified array
	public static void printarray(int[]arr){

		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\n");
	}
}

	//for(int array:arr){
	//		System.out.print(array);
	//	}
		
	//}