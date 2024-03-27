import java.util.Random;
public class ArrayChallenge361{

	public static void main(String[] args){

		//3D empty integer array
		int [][][] arr3D=new int[10][10][3];

		//2D empty integer array , outer of 10, inner of 10
		int [][] arr2D=new int[10][10];

		System.out.println("\n\n Populated 3D array\n");

		//populates 3D array
		populate3Darr(arr3D);

		//prints 3D array
		print3Darray(arr3D);

		System.out.println("\n\n Populated 2D array\n");

		//populates 2D array
		populate2Darr(arr2D);

		//prints 2D array
		print2Darray(arr2D);
	}

	//method to populate 3D array
	public static void populate3Darr(int[][][]arr3D){

		//random method for inserting random numbers in array
		Random random = new Random();

		 for(int i=0;i<arr3D.length;i++){
		 	for(int j=0;j<arr3D[i].length;j++){
		 		for(int k=0;k<arr3D[i][j].length;k++){
		 			//inserts random numbers between 1-100
		 			arr3D[i][j][k] = random.nextInt(100); 
		 		}
		 	}
		 }

	}

	//method to populate 2D array
	public static void populate2Darr(int[][]arr2D){

		//random method for inserting random numbers in array
		Random random=new Random();

		for(int i=0;i<arr2D.length;i++){
			for(int j=0;j<arr2D[i].length;j++){
				//inserts random numbers between 1-100
				arr2D[i][j]=random.nextInt(100);
			}
		}
	}

	//method to print 3D array
	public static void print3Darray(int[][][]arr3D){
		//prints each element of 3D array
		for(int [][] arr2D:arr3D){
			for(int [] arr1D: arr2D){
				for(int item:arr1D){
					System.out.print(item+"\t");
				}
			}
			System.out.println("\n");
		}
		System.out.println("\n");
	}

	//method to print 2D array
	public static void print2Darray(int[][]arr2D){
		//prints each element of 2D array
		for(int [] outer:arr2D){
			for(int inner:outer){
				System.out.print(inner+"\t");
			}
			System.out.println("\n");
		}
	}
}

//Alternative Methods

 //public static void printarray(int[][]arr){
    	 // Print the entire multi-dimensional array starting from index 1
   //     for (int i = 0; i < arr.length; i++) {
     //       for (int j = 0; j < arr[i].length; j++) {
                //System.out.print(arr[i][j] + " \t");
       //     }
         //   System.out.println("\n"); // Move to the next line after each row
        //}
   // }

//public static void populate3Darr(int[][][]arr3D){
//		 Random random = new Random();
//		 for(int i=0;i<arr3D.length;i++){
//		 	for(int j=0;j<arr3D[i].length;j++){
//		 		for(int k=0;k<arr3D[i][j].length;k++){
//		 			System.out.print(arr[i][j][k]+"\t");
//		 			//System.out.print(arr3D[i][j][k]+"\t");
//		 		}
//		 	}
//		 }
//
//	}

//public static void populatearray(int[][]arr){
    	// Populate the multi-dimensional array
//        for (int i = 0; i < arr.length; i++) {
  //          for (int j = 0; j < arr[i].length; j++) {
    //            arr[i][j] = i + j;
      //      }
        //}
    //}

//public static void populatearray(int[][]arr){
    	// Populate the multi-dimensional array
  //      for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
  //              for(int k=0;k>arr[i][j].length;k++){
    //            	arr[i][j][k] = i + j+k;
      //          }
        //    }
        //}
    //}

