public class DeepDiveArray9{
	public static void main (String []args){


		
		//array with outer of 8, and inner is 10
		int [][] arr={{1,2,3,4,5,6,7,8,9,10},
					  {11,12,13,14,15,16,17,18,29,20},
					  {21,22,23,24,25,26,27,28,29,30},
					  {31,32,33,34,35,36,37,38,39,40},
					  {41,42,43,44,45,46,47,48,49,50},
					  {51,52,53,54,55,56,57,58,59,60},
					  {61,62,63,64,65,66,67,68,69,70},
					  {71,72,73,74,75,76,77,78,79,80}};

		System.out.println("\n\nArray\n");

		//prints entire multi-dimensional array		
		printarray(arr);
		

		System.out.println("\n\nNumbers divisible by 11 and are even in Array\n");
		divisiblearray(arr);
		

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

	public static void divisiblearray(int[][]arr){
		int i11=0;
		while(i11<arr.length){
			int j11=0;
			while(j11<arr[i11].length){

				//sorts through even numbers divisible by 11, and prints
				int div2=arr[i11][j11]%2;
				int div11=arr[i11][j11]%11;
				switch(div2){
				case 0:
					switch(div11){
						case 0:
						System.out.print(arr[i11][j11]+" ");
						break;
					}
				
				}
				j11++;
				
			}
			System.out.println("\n");
			i11++;
		}
	}
}

