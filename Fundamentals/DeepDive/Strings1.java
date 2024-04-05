public class Strings1{
	public static void main(String[]args){

		//String declared line
		String line="1,4,3,2,3,7,5,6,9";

		//String array that stores values between ","
		String[]parts=line.split(",");
		//new int array to store values of String array
		int[]newarray=new int[parts.length];

		//copy elements from initial parts array (converted to int) to newarray
		for(int i=0;i<newarray.length;i++){
			newarray[i]= Integer.parseInt(parts[i]);


		}

		//Prints initial array
		printarray("String -> Array : ",newarray);

		//arranges array in ascending order
		newsortasc(newarray);

		//Prints new ascending array
		printarray("Array in ascending order : ",newarray);

		//arranges array in descending order
		newsortdesc(newarray);

		//Prints new descedning array
		printarray("Array in descending order :",newarray);

	}

	//Method to pretty print array array 
    public static void printarray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            } 
        }
        System.out.print("]\n\n");
    }

    //method that assigns and sorts new array (ascending)
    public static void newsortasc(int[]arr){
         
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    //method that assigns and sorts new array (descending)
    public static void newsortdesc(int[]arr){
         
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}


//public static void newsortasc(int[] arr) {
  ///  for (int i = 1; i < arr.length; i++) {
     //   int key = arr[i];
       // int j = i - 1;
        //while (j >= 0 && arr[j] > key) {
          //  arr[j + 1] = arr[j];
            //j--;
        //}
        //arr[j + 1] = key;
    //}
//}


//public static void newsortdesc(int[] arr) {
  //  for (int i = 1; i > arr.length; i++) {
    //    int key = arr[i];
      //  int j = i - 1;
        //while (j >= 0 && arr[j] > key) {
          //  arr[j + 1] = arr[j];
            //j--;
        //}
        //arr[j + 1] = key;
    //}
//}



//quickSort(newarray,0,newarray.length-1)

/*public static void quickSort(int[] arr, int low, int high) {
       if (low < high) {
           int pi = partition(arr, low, high);

           quickSort(arr, low, pi - 1);
           quickSort(arr, pi + 1, high);
       }
   }

   private static int partition(int[] arr, int low, int high) {
       // our pivot is the middle element of the array
       int middle = low + (high - low) / 2;
       int pivot = arr[middle];

       // Swap the pivot element with the last one to use existing logic
       int temp = arr[middle];
       arr[middle] = arr[high];
       arr[high] = temp;

       int i = (low - 1);
       for (int j = low; j < high; j++) {
           if (arr[j] < pivot) {
               i++;

               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }

       temp = arr[i + 1];
       arr[i + 1] = arr[high];
       arr[high] = temp;

       return i + 1;
   }*/