public class DeepDiveArray10 {
    public static void main(String[] args) {
    	//empty array with 100 outer 30 inner
        int[][] arr = new int[100][30];

        System.out.println("\n\nArray\n");

        // Populate the multi-dimensional array
        populatearray(arr);

       // Print the entire multi-dimensional array starting from index 1
        printarray(arr);


        System.out.println("\n\n Incremented Array\n");

        //Increments existing array by 1
        incrementarray(arr);

        //prints entire new incremented multi-dimensional array
        printarray(arr);


    }
    public static void populatearray(int[][]arr){
    	// Populate the multi-dimensional array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }
    }
    public static void printarray(int[][]arr){
    	 // Print the entire multi-dimensional array starting from index 1
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println("\n"); // Move to the next line after each row
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

//public static void populatearray(int[][] arr) {
 //   Random random = new Random();
   // for (int[] row : arr) {
     //   for (int i = 0; i < row.length; i++) {
            // Generates random numbers between 0 and 99
       //     row[i] = random.nextInt(100);
        //}
    //}
//}



