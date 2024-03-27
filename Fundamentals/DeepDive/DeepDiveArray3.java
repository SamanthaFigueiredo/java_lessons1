public class DeepDiveArray3{
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

		//prints even numbers and divisible by 11 in array
		divisiblearray(arr);

	}

	public static void printarray(int[]arr){
		//prints entire array

		int n=0;//array element initialisation

		while(n<arr.length){

			System.out.print(arr[n]+" ");
			n++;

		}
	}

	public static void divisiblearray(int[]arr){
		int n2=0;//array element initialisation

		while(n2<arr.length){

			//sorts through numbers divisible by 2, and prints
			int div2=arr[n2]%2;
			int div11=arr[n2]%11;

			//prints if it is divisible
			switch(div2){
				case 0:
				switch(div11){
					case 0:
					System.out.print(arr[n2]+" ");	
					break;	
				}
			}
			n2++;
		}
	}
}

//Enhanced for loop alternative
//prints entire array
		//for(int nums:arr ){
		//	System.out.print(nums+" ");
		//}



