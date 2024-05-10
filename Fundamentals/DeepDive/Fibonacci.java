import java.util.*;
public class Fibonacci{
	public static void main(String[]args){

		//defined array with a size of 50
		int []fibarr=new int[50];

		//Called Method that populates array
		populatearray(fibarr);

		//Called method that prints the arrays values
		printarray(fibarr);
		
	}

	//Prints array's elements
	public static void printarray(int[]fibarr){
		//Iterate and print elements
		for(int i=0;i<fibarr.length;i++){

			System.out.println(fibarr[i]);

		}

	}

	//Populates array with elements (Fibonacci)
	public static void populatearray(int[]fibarr){
		//assigning values to index 0 and 1
		fibarr[0]=0;
		fibarr[1]=1;

		//iterates through loop and assigns values to indexes
		for(int i=2;i<fibarr.length;i++){

			

			//adds values at i-1 and i-2 in the array
			fibarr[i]=fibarr[i-1]+fibarr[i-2];
			
		}
	}
}


//Alternative

// public static void main(String args[]) {
//     int n, i;
//     Scanner sc = new Scanner(System.in);

//     n = sc.nextInt();
//     sc.close();

//     int values[] = new int[n]; // space O(N) used
//     values[0] = 0;
//     values[1] = 1;

//     for (i = 2; i < n; i++) {
//       values[i] = values[i - 1] + values[i - 2];
//     }
//     System.out.println("The nth fibonacci number is " + values[n - 1]);
//   }