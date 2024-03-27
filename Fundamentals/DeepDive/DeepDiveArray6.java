public class DeepDiveArray6{
	public static void main (String []args){

	//empty array with size of 50
		int [] arr = new int[50];

		System.out.println("\nArray\n");

		//populates each element in array
		populatearray(arr);

		//prints each element of array
		printarray(arr);		

		System.out.println("\n\nNumbers divisible by 11 and are even in Array\n");

		//prints even and divisible by 11 numbers in array
		divisiblearray(arr);
		
	}

	public static void populatearray(int[]arr){
		//populates each element in array
		int i=0;//array element initialisation
		while(i<arr.length){

			arr[i]=i;
			i++;
			
		}
	}

	public static void printarray(int[]arr){
		//prints each element of array
		int iprint=0;//array element initialisation
		while(iprint<arr.length){

			System.out.print(arr[iprint] + " ");
			iprint++;

		}
	}

	public static void divisiblearray(int[]arr){
		//prints even and divisible by 11 numbers in array
		int i2=0;//array element initialisation
		while(i2<arr.length){

			//sorts through numbers divisible by 2, and prints
			int div2=arr[i2]%2;
			int div11=arr[i2]%11;

			//prints if it is divisible
			switch(div2){
			case 0:
				switch(div11){
					case 0:
					System.out.print(arr[i2]+" ");	
					break;	
				}
			}
			i2++;
		}
	}


}

//Enhanced for loop alternative
//prints entire array
		//for(int nums:arr ){
		//	System.out.print(nums+" ");
		//}

//public static void populatearray(int[]arr){
//		Random random = new Random();
//		int i=0;
//		 while ( i < arr.length) {
            // Generates random numbers between 0 and 99
  //          	arr[i] = random.nextInt(100); 
    //        } i++