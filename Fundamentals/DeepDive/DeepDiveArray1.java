public class DeepDiveArray1{
	public static void main (String[]args){

		//array with size of 50
		int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,
		           20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,
		           36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
		//Checks array size for user
		System.out.println("\nSize of Array: "+arr.length+"\n\n");

		//prints entire array
		printarray(arr);
		
		System.out.println("\n\nArray with Added 1\n");

		//prints array +1
		arrayincrement(arr);
		printarray(arr);
			
	}

	public static void printarray(int[]arr)
	{
		//prints entire array
		for(int n=0;n<arr.length;n++){

			System.out.print(arr[n]+" ");

		}
	}

	public static void arrayincrement(int[]arr){
		//prints array +1
		for(int n=0;n<arr.length;n++){
			//adds 1 to each element
			arr[n]=arr[n]+1;
		
		}	
	}
	

}


//Enhanced for loop alternative
//prints entire array
		//for(int nums:arr ){
		//	System.out.print(nums+" ");
		//}

//Increments array by 1
		//for(int nums:arr ){
			//int add1=nums+1;
			//prints new array
			//System.out.print(add1+" ");
		//}