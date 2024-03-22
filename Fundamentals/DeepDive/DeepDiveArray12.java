public class DeepDiveArray12 {
    public static void main(String[] args) {
    	//empty array with 100 outer 30 inner
        int[][] arr = new int[100][30];

        System.out.println("\n\nArray\n");

        // Populate the multi-dimensional array
        populatearray(arr);

       // Print the entire multi-dimensional array starting from index 1
        printarray(arr);


        System.out.println("\n\nNumbers divisible by 8 and are odd in Array\n");

        //prints odd numbers and divisibles of 8 in both outer and inner array
        divisiblearray(arr);

        


    }
    public static void populatearray(int[][]arr){
    	// Populate the multi-dimensional array
        int i = 0;
        while ( i < arr.length) {
            int j = 0;
            while ( j < arr[i].length) {
                arr[i][j] = i + j;
                j++;
            }i++;
        }
    }
    public static void printarray(int[][]arr){
    	int i=0;
        //prints entire multi-dimensional array                     
        while(i<arr.length){
            int j=0;
            while(j<arr[i].length){
                System.out.print(arr[i][j]+" \t");
                j++;
            }
            System.out.println("\n");
            i++;
        }
    }
    
    public static void divisiblearray(int [][]arr){

        int i11=0;
        while(i11<arr.length){
            int j11=0;
            while(j11<arr[i11].length){

                //sorts through odd numbers divisible by 8, and prints
                int div2=arr[i11][j11]%2;
                int div11=arr[i11][j11]%8;
                switch(div2){
                case 0:
                break;    
                default:
                    switch(div11){
                    case 0:
                    System.out.print(arr[i11][j11]+" \t");
                    break;
                    }
                
                }
                j11++;
                
            }
            
            i11++;
        }    }

}

//public static void populatearray(int[][]arr){
        // Populate the multi-dimensional array
  //      int i = 0;
 //   Random random = new Random();
    //    while ( i < arr.length) {
      //      int j = 0;
        //    while ( j < arr[i].length) {
          //     row[i] = random.nextInt(100);
            //    j++;
            //}i++;
        //}
    //}
