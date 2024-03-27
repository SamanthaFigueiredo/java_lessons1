public class DeepDiveArray7{
	public static void main (String[]args){

		//array with outer of 8, and inner is 10

		int [][] arr={{1,2,3,4,5,6,7,8,9,10},
					  {11,12,13,14,15,16,17,18,29,20},
					  {21,22,23,24,25,26,27,28,29,30},
					  {31,32,33,34,35,36,37,38,39,40},
					  {41,42,43,44,45,46,47,48,49,50},
					  {51,52,53,54,55,56,57,58,59,60},
					  {61,62,63,64,65,66,67,68,69,70},
					  {71,72,73,74,75,76,77,78,79,80}};//inner

		System.out.println("\n\nArray\n");
		
		printarray(arr);

		System.out.println("\n\nNew Array with increment +1\n");
		incrementarray(arr);
		printarray(arr);

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


	public static void incrementarray(int[][]arr){
		//prints entire new incremented multi-dimensional array
		for(int i=0;i<arr.length;i++){

			for(int j=0;j<arr[i].length;j++){
				//increment array by 1
				arr[i][j]=arr[i][j]+1;
				
			}
			
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
