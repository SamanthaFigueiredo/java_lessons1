public class DeepDiveBracketless12{
	public static void main (String []args){

		//Empty array with size of 10
		int arr[] = new int[11];	 
		
		//populate empty array  
		populatearray(arr);

		//prints the elements and their outputs
		int i = 0;//declares i value
		while( i<arr.length) 
		printarray(arr[i++]);	
		
	}

	//populate empty array with 0-10
	public static void populatearray(int[]arr){

		//iterates through array
		int i = 0; //declares i value
		while( i<arr.length) 
			arr[i] = i++; 
				
	}
	//prints the elements and their outputs

	public static void printarray(int arr){
		//nested ifs to check if values are greater
			if(arr>1)
				if(arr>2)
					if(arr>3)
						if(arr>4)
							if(arr>5)
								if(arr>6)
									if(arr>7)
										if(arr>8)
											if(arr>9)
												System.out.println("Greater than 9");
													else
				 									System.out.println("Greater than 8");
				 								else
				 								System.out.println("Greater than 7");
				 							else
				 							System.out.println("Greater than 6");
				 						else
				 						System.out.println("Greater than 5");
				 					else
				 					System.out.println("Greater than 4");
				 				else
				 				System.out.println("Greater than 3");
				 			else
				 			System.out.println("Greater than 2");
				 		else
				 		System.out.println("Greater than 1");		
	}
}