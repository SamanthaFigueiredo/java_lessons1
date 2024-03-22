public class DeepDiveArray5{
	public static void main (String []args){

	//empty array with size of 50
		int [] arr = new int[50];

		System.out.println("\nArray\n");

		//populates each element in array
		populatearray(arr);

		//prints each element of array
		printarray(arr);


		System.out.println("\n\nNumbers divisible by 11 and are even in Array\n");

		//prints valuesa that are even and divisible by 11.
		divisiblearray(arr);

	}

	public static void populatearray(int[]arr){
		//populates each element in array
		for(int i=0; i<arr.length;i++){

			arr[i]=i;
			
		}
	}

	public static void printarray(int[]arr){
		//prints each element of array
		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i] + " ");

		}
	}

	public static void divisiblearray(int[]arr){
		//prints even and divisible by 11 numbers in array
		for(int i=0;i<arr.length;i++){
			//sorts through numbers divisible by 2, and prints
			if(arr[i]%2==0 && arr[i]%11==0 ){
				
					System.out.print(arr[i]+" ");
				
				
			}
		}
	}

}

//Other Alternatives
//public static void populatearray(int[]arr){
//		Random random = new Random();
//		 for (int i = 0; i < arr.length; i++) {
            // Generates random numbers between 0 and 99
  //          	arr[i] = random.nextInt(100); 
    //        }
        
//prints array
//for(int array:arr){
	//System.out.print(array + " ");
	//	}

//public static void divisiblearray(int[]arr){
		//prints even and divisible by 11 numbers in array
//		for(int i=0;i<arr.length;i++){
			//sorts through numbers divisible by 2, and prints
//			if(arr[i]%2==0){
//				if(arr[i]%11==0){
//					System.out.print(arr[i]+" ");
//				}
//				
//			}
//		}
//	}

