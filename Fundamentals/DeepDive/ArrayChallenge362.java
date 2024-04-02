public class ArrayChallenge362{

	public static void main(String[]args){

		//1D empty arrays for even,odd and prime numbers -size 100
		int [] even=new int[100];
		int [] odd=new int[100];
		int [] prime=new int [100];
		int [][] twoDarray = new int [3][100];

		//called methods that populate and print even numbers array
		System.out.println("\nEven Numbers\n");
		populateven(even);
		printarr(even);

		//called methods that populate and print odd numbers array
		System.out.println("\nOdd Numbers\n");
		populateodd(odd);
		printarr(odd);

		//called methods that populate and print prime numbers array
		System.out.println("\nPrime Numbers\n");
		populateprime(prime);
		printarr(prime);

		for (int i = 0; i < even.length; i++) {
            twoDarray[0][i] = even[i];
            twoDarray[1][i] = odd[i];
            twoDarray[2][i] = prime[i];
        }

        System.out.println("\nCombined 2D Array\n");
        for(int[] row : twoDarray){
            for(int num : row){
                System.out.print(num + "\t");
            }
            System.out.println(); // add newline after each row
        }
	}

	//even population method that inserts even numbers in array
	public static void populateven(int[]even){
		
		for(int i=0;i<even.length;i++){

			even[i]=i+i;
			//Alternative: even[i]=i*2;
			
		
		}
	}

	//odd population method that inserts odd numbers in array
	public static void populateodd(int[]odd){

		for(int i=0;i<odd.length;i++){
			 odd[i] = 2 * i + 1;
		}
	}

	//prime population method that inserts even numbers in array
	public static void populateprime(int[] prime) {
    int count = 0;
    //iterates through the array
    for (int i = 2; count < prime.length; i++) {
    	//flag to check if value is prime (true)
        boolean isPrime = true;
        //checks if values is negative. (not prime)
        if (i <= 1) {
            isPrime = false;
        } else { 
        	//To not  get values equal to 0, use value less than that (i-1)
            for (int j = 2; j <i-1; j++) {
            	//eg 8%8=0 . (not prime)
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        //equals true
        if (isPrime) {
            prime[count] = i;
            count++;
        }
    }
}

	//method to print elements in specific array
   	public static void printarr(int[]arr){
   		for(int i=0;i<arr.length;i++){
   			System.out.print(arr[i] + "\t ");
   		}
    }


    
 
}

//Alternative for printing even numbers
// for(int i=0 ;i<even.length;i++){   
  //      even[i] =i;
    //}
    //for(int j: myList){
      //if(j%2==0){      // checking for even 
        // System.out.println("even elements:" +j);
     //}


//Alternative for odd numbers 
//for (int i = 1; i < prime.length; i = i + 2) {
  //    odd[i]=i;
    //}


//Alternative for printing
//method to print all prime numbers in array
    //public static void printeven(int[]even){
   	//	for(int i=0;i<even.length;i++){
   	//		System.out.print(even[i] + "\t ");
   	//	}
    //}
//method to print all odd numbers in array
    //public static void printodd(int[]odd){
   	//	for(int i=0;i<odd.length;i++){
   	//		System.out.print(odd[i] + "\t ");
   	//	}
   	//}
   	//method to print all prime numbers in array
    //public static void printprime(int[]prime){
   	//	for(int i=0;i<prime.length;i++){
   	//		System.out.print(prime[i] + "\t ");
   	//	}
    //}