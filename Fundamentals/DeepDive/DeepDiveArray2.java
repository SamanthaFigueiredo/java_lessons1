public class DeepDiveArray2{
	public static void main(String[]args){

		//array with size of 50
		int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
		           20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,
		           36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};

		//Checks array size for user
		System.out.println("\nSize of Array: "+arr.length+"\n\n");

		//prints entire array
		printarray(arr);

		System.out.println("\n\nNumbers divisible by 11 and are even in Array\n");

		//prints numbers divisible by 11 in array
		divisiblearray(arr);
		

	}
	public static void printarray(int[]arr){
		//prints entire array
		for(int n=0;n<arr.length;n++){

			System.out.print(arr[n]+" ");

		}
	}

	public static void divisiblearray(int []arr){
		for(int n=0;n<arr.length;n++){
			//sorts through numbers divisible by 11, and prints
			if(arr[n]%2==0 && arr[n]%11==0){
			System.out.print(arr[n]+" ");		}
		}
	}
}

//Enhanced for loop alternative
//prints entire array
		//for(int nums:arr ){
		//	System.out.print(nums+" ");
		//}

//public static void divisiblearray(int []arr){
//		for(int n=0;n<arr.length;n++){
//			//sorts through numbers divisible by 11, and prints
			//if(arr[n]%2==0){
			//	if(arr[n]%11==0){
			//		System.out.print(arr[n]+" ");
			//	}
//			
//		}
//	}