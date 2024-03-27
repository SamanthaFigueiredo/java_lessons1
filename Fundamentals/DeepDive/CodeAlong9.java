public class CodeAlong9{

	public static void main(String[]args){

		//int array with size of [10][10]
		int[][]arr={{1,2,3,4,5,6,7,8,9,10},
					 {11,12,13,14,15,16,17,18,19,20},
					 {21,22,23,24,25,26,27,28,29,30},
					 {31,32,33,34,35,36,37,38,39,40},
					 {41,42,43,44,45,46,47,48,49,50},
					 {51,52,53,54,55,56,57,58,59,60},
					 {61,62,63,64,65,66,67,68,69,70},
					 {71,72,73,74,75,76,77,78,79,80},
					 {81,82,83,84,85,86,87,88,89,90},
					 {91,92,93,94,95,96,97,98,99,100}};

			//row 3
			int rowNumber = 9;
			//column 5
			int colNumber=8;
			System.out.println("\nRows\n\n");

			//method called to retrieve row from 2D array
        	getRow(arr, rowNumber);

        	System.out.println("\nColumns\n\n");

        	//methoc called to retrieve column from 2D array
        	getColumn(arr,colNumber);



        	System.out.println("\nCell\n\n");
        	getCell(arr,rowNumber,colNumber);
        	
        	
	}
	//method to retrieve row
	public static void getRow(int[][] arr, int row) {
      		//if it is negative or greater than 10, will print error message
            if (row < 0 || row >= arr.length) {
               System.out.println("Row out of bounds");
            }else{

            //iterates through each element in row
            for(int i=0;i<arr.length;i++){
            	System.out.print(arr[row][i] + " ");
            	
            }
        }
       
	}
	//method to retrieve column 
	public static void getColumn(int[][]arr,int col){
		//if it is negative or greater than 10, will print error message
		if (col < 0 || col >= arr.length) {

               System.out.println("Row out of bounds");

        }else{

        //iterates through each element in column
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i][col]+" ");
			
		}
	}
	}
	public static void getCell(int[][]arr,int row,int col){
		//if row or column are negative or greater than 10, will print error message
		if ((col < 0 || col >= arr.length) ||(row < 0 || row >= arr.length)) {

               System.out.println("Row out of bounds");

      }else{		
			//Output of specific element from row and column
			System.out.print(arr[row][col]+" ");
				
			}
	}
	
}

//public static int[] getRow(int[][] arr, int row) {
  //      try {
    //        if (row < 0 || row >= arr.length) {
      //          throw new IndexOutOfBoundsException("Row out of bounds");
        //    }
//
  //          return arr[row]; // Return the specified row
    //    } catch (IndexOutOfBoundsException e) {
      //      System.out.println("Row out of bounds: " + e.getMessage());
        //    return null;
        //}
	//}