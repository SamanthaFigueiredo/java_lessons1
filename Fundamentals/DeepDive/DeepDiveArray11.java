public class DeepDiveArray11 {
    public static void main(String[] args) {
    	//empty array with 100 outer 30 inner
        int[][] arr = new int[100][30];

        System.out.println("\n\nArray\n");

        // Populate the multi-dimensional array
        populatearray(arr);

       // Print the entire multi-dimensional array starting from index 1
        printarray(arr);


        System.out.println("\n\n Odd numbers divisible by 8 from Array\n");

        //prints odd numbers and divisibles of 8 in both outer and inner array
        divisiblearray(arr);

        


    }
    public static void populatearray(int[][]arr){
    	// Populate the multi-dimensional array
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }
    }
    public static void printarray(int[][]arr){
    	 // Print the entire multi-dimensional array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println("\n"); // Move to the next line after each row
        }
    }
    
    public static void divisiblearray(int [][]arr){

        //prints odd numbers and divisibles of 8 in both outer and inner array
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                //sorts through numbers divisible by 11, and prints
                if(arr[i][j]%2!=0){
                    if(arr[i][j]%8==0){
                        System.out.print(arr[i][j]+" ");
                    }
                    
                }
                
            }
           
        }
    }

}
