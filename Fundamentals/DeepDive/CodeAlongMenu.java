import java.util.Scanner;
public class CodeAlongMenu{
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

		
			//switch to select appropriate method call
			switch(printMenu()){
			case 1:
				//method to retrieve specific row when valid.
				getRow(arr,promptRow(arr));
				break;
			
			case 2:
				//method to retrieve specific column when valid.
				getColumn(arr,promptColumn(arr));
				break;

			case 3:
				//method to retrieve specific cell when valid.
				getCell(arr,promptCell(arr));
				break;
			
		}


	}

	//method to print selection for users
	public static int printMenu(){
		//loop until valid
		while(true){
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("\nWhat would you like to retrive? \n 1. Row \n 2. Column \n 3. Cell \n ");
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		String menu=prompt("Choose an option (1-3) -> ");
		int newmenu=Integer.parseInt(menu);

		if((newmenu>0 && newmenu<4)){
			return newmenu;
		}
		else{
			System.out.println("Invalid or empty option chosen. Please re-enter.");
		}

		
		}
	}


	//Method to allow user input
	public static String prompt(String prompt){
			//prints the prompt for the user to enter their information
			System.out.println(prompt);
			//initialises app allowing user to enter their own information
			Scanner in=new Scanner(System.in);
			return in.nextLine();
	}

	//prompts and validates the users row value
	public static int promptRow(int[][]arr){
		//loop until valid
		while(true){
			String rownum=prompt("Please enter Row Number -> ");
			int newrownum=Integer.parseInt(rownum);

			if ((newrownum > 0 && newrownum <= arr.length)) {
               return newrownum;
            }else{
				System.out.println("Row out of bounds");
			}
		}
			
}
	//prompts and validates the users column value
	public static int promptColumn(int[][]arr){
		//loop until valid
		while(true){
			String colnum=prompt("Please enter Column Number -> ");
			int newcol=Integer.parseInt(colnum);
			if ((newcol > 0 && newcol <= arr.length)) {
               return newcol;
            }else{
				System.out.println("Row out of bounds");
			}
		}

		

		

	}
	//prompts and validates the users cell and row value
	public static int[] promptCell(int[][]arr){
		//loop until valid
		while(true){
			String rownum=prompt("Please enter Row Number -> ");

			String colnum=prompt("Please enter Column Number -> ");

			int newrow=Integer.parseInt(rownum);
			int colnew=Integer.parseInt(colnum);

			//int[] array=new int[2];
			int[] newArray = {newrow, colnew}; 

			if ((newrow > 0 && newrow <= arr.length) && (colnew > 0 && colnew <= arr.length)) {
			
               return newArray;
            } else {
                System.out.println("Invalid input! Row and column must be within array bounds.");
            }
		}
		

	}


	//method to retrieve row
	public static void getRow(int[][] arr, int row) {           

            //iterates through each element in row
            for(int i=0;i<arr.length;i++){
            	System.out.print(arr[row][i] + " ");
            	
            
        }
       
	}

	//method to retrieve column 
	public static void getColumn(int[][]arr,int col){
		
        //iterates through each element in column
		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i][col]+" ");
			
		}
	
	}

	public static void getCell(int[][]arr, int[] newArray){
		//if row or column are negative or greater than 10, will print error message
				
			//Output of specific element from row and column
			System.out.print(arr[newArray[0]][newArray[1]]+" ");
				
			
	}
}




