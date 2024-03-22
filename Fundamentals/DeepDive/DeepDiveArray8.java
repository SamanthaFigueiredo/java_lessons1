public class DeepDiveArray8{
	public static void main (String []args){


		//array with outer of 8, and inner is 10
		int [][] arr={{1,2,3,4,5,6,7,8,9,10},
					  {11,12,13,14,15,16,17,18,29,20},
					  {21,22,23,24,25,26,27,28,29,30},
					  {31,32,33,34,35,36,37,38,39,40},
					  {41,42,43,44,45,46,47,48,49,50},
					  {51,52,53,54,55,56,57,58,59,60},
					  {61,62,63,64,65,66,67,68,69,70},
					  {71,72,73,74,75,76,77,78,79,80}};

		System.out.println("\n\nArray\n");
		
		//prints entire multi-dimensional array						
		printarray(arr);
		
		System.out.println("\n\nNew Array Numbers Divisible by 11\n");

		//prints even numbers and divisibles of 11 in both outer and inner array
		divisiblearray(arr);

		

	}
	public static void printarray(int[][]arr){
		//prints entire multi-dimensional array						
		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" \t");
			}
			System.out.println("\n");
		}
	}

	public static void divisiblearray(int [][]arr){

		//prints even numbers and divisibles of 11 in both outer and inner array
		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr[i].length;j++){
				//sorts through numbers divisible by 11, and prints
				if(arr[i][j]%2==0 && arr[i][j]%11==0 ){
					
						System.out.print(arr[i][j]+" ");
					
					
				}
				
			}
			System.out.println("\n");
		}
	}
}

//public static void printarray(int[][] arr) {
    // prints entire multi-dimensional array
  //  for (int[] row : arr) {
    //    for (int element : row) {
      //      System.out.print(element + " \t");
        //}
        //System.out.println("\n");
    //}
//}

//public static void divisiblearray(int [][]arr){

		//prints even numbers and divisibles of 11 in both outer and inner array
//		for(int i=0;i<arr.length;i++){

//			for(int j=0;j<arr[i].length;j++){
				//sorts through numbers divisible by 11, and prints
//				if(arr[i][j]%2==0){
//					if(arr[i][j]%11==0){
//						System.out.print(arr[i][j]+" ");
//					}
//					
//				}
//				
//			}
//			System.out.println("\n");
//		}
//	}