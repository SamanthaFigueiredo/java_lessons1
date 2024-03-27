public class DeepDiveBracketless{
	public static void main (String []args){

		//Empty array with size of 10
		int arr[] = new int[11];	 
		
		//populate empty array  
		populatearray(arr);

		//prints the elements and their outputs
		for(int i = 0; i<arr.length; i++) 
		printarray(arr[i]);	
	}

	//populate empty array with 0-10
	public static void populatearray(int[]arr){
		//iterates through array
		for(int i = 0; i<arr.length; i++) 
			arr[i] = i; 	
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




//public class DeepDiveBracketless{
//	public static void main (String []args){
//
//		//Empty array with size of 10
//		int arr[] = new int[11];	 
//		
//		//populate empty array  
//		populatearray(arr);
//
//		//prints the elements and their outputs
//		printarray(arr);
//				
//	}
//
//	//populate empty array with 0-10
//	public static void populatearray(int[]arr){
//		//iterates through array
//		for(int i = 0; i<11; i++) 
//			arr[i] = i; 	
//	}
//	//prints the elements and their outputs
//	public static void printarray(int[] arr){
//		//nested ifs to check if values are greater
//		for(int i=0;i<11;i++)
//			if(arr[i]>1)
//				if(arr[i]>2)
//					if(arr[i]>3)
//						if(arr[i]>4)
//							if(arr[i]>5)
//								if(arr[i]>6)
//									if(arr[i]>7)
//										if(arr[i]>8)
//											if(arr[i]>9)
//												System.out.println("Greater than 9");
//													else
//				 									System.out.println("Greater than 8");
//				 								else
//				 								System.out.println("Greater than 7");
//				 							else
//				 							System.out.println("Greater than 6");
//				 						else
//				 						System.out.println("Greater than 5");
//				 					else
//				 					System.out.println("Greater than 4");
//				 				else
//				 				System.out.println("Greater than 3");
//				 			else
//				 			System.out.println("Greater than 2");
//				 		else
//				 		System.out.println("Greater than 1");		
//	}
//}