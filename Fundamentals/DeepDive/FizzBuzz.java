public class FizzBuzz{
	public static void main(String[]args){
		
		int[] array=new int[101];

		//method called to populate it from 1-100
		populatearray(array);

		//method to print the newly populated array
		System.out.println("\n Normal Array \n");
		printarray(array);

		//method that iterates through array and allocates FizzBuzz
		System.out.println("\n Fizz Buzz Array \n");
		fizzbuzz(array);
		//printarray(array);
	}

	//method to populate array 1-array-length
	public static void populatearray(int[]array){
		for(int i=1;i<array.length;i++){
			array[i]=i;
		}
	}

	//method to print initial array
	public static void printarray(int[]array){
		for(int i=1;i<array.length;i++){
			System.out.print(array[i]+"\t");
		}
		System.out.print("\n");
	}

	//method to iterate through array and assign values
	public static void fizzbuzz(int[]array){
		
		for(int i=1;i<array.length;i++){
			if((array[i]%3==0) && (array[i]%5==0)){
				 System.out.print("FizzBuzz"+"\t");
			}else if (array[i]%3==0){
				 System.out.print("Fizz"+"\t");
			}else if (array[i]%5==0){
				 System.out.print("Buzz"+"\t");
			}else{
				System.out.print(array[i]+"\t");
			}
		
		}
	}	
}

//int[] array={1,2,3,4,5,6,7,8,9,10,
//			11,12,13,14,15,16,17,18,19,20,
//			21,22,23,24,25,26,27,28,29,30,
//			31,32,33,34,35,36,37,38,39,40,
//			41,42,43,44,45,46,47,48,49,50,
//			51,52,53,54,55,56,57,58,59,60,
//			61,62,63,64,65,66,67,68,69,70,
//			71,72,73,74,75,76,77,78,79,80,
//			81,82,83,84,85,86,87,88,89,90,
//			91,92,93,94,95,96,97,98,99,100};





//public static void fizzbuzz(int[] array) {
  //  for (int num : array) {
    //    switch (num % 15) {
      //      case 0:
        //        System.out.print("FizzBuzz\t");
          //      break;
            //case 3:
            //case 6:
            //case 9:
            //case 12:
              //  System.out.print("Fizz\t");
                //break;
            //case 5:
            //case 10:
              //  System.out.print("Buzz\t");
                //break;
           // default:
             //   System.out.print(num + "\t");
               // break;
        //}
    //}
//}
