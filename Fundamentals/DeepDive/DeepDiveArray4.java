public class DeepDiveArray4{
	public static void main(String []args){

		//empty array with size of 50
		int [] arr = new int[50];

		System.out.println("\nArray\n");

		//populates each element in array
		populatearray(arr);

		//prints each element of array
		printarray(arr);

		System.out.println("\n\nNew array increment with 1\n");

		//Increment each element by 1 in array
		incrementarray(arr);

		//Prints new array with incremented elements
		printarray(arr);

	}

	public static void populatearray(int[]arr){
		//populates each element in array
		for(int i=1; i<arr.length;i++){

			arr[i]=i;
			
		}
	}

	public static void printarray(int[]arr){
		//prints each element of array
		for(int i=1;i<arr.length;i++){

			System.out.print(arr[i] + " ");

		}
	}
	public static void incrementarray(int[]arr){
		//Increments each element by 1 in array
		for(int i=1; i<arr.length;i++){
			arr[i]=i+1;
			
		}
	}
	
}

//Other alternative
//prints array
//for(int array:arr){
	//System.out.print(array + " ");
	//	}

//Increments array by 1
		//for(int array:arr ){
			//int add1=array+1;
			//prints new array
			//System.out.print(add1+" ");
		//}
