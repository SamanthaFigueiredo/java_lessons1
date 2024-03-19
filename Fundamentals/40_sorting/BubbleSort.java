public class BubbleSort{
	public static void bubbleSort(int arr[]){
   		int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
            for(int j=1; j < (n-i); j++){  
                if(arr[j-1] > arr[j]){  
                    //swap elements  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
                          
          	} 
         }
	}

	public static void main(String[]args){

		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };

		 System.out.println("Array Before Bubble Sort");  

            for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
            }  
		bubbleSort(arr);
		
		System.out.println("\nArray After Bubble Sort");  

            for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
            }  
	}
	
}