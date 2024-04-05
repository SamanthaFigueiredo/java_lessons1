public class ArrayManipulation1_7 {
    public static void main(String[]args){

        //initial array
        int[] array = {3,4,2,6,4,7,9,1,0,0,0,0,0};

        //called method to print array
        printArray("array before trim ",array);

        //Assigned method thhat trims array when a 0 is present       
        array = trim(array);

        //called method to print new trimmed array
        printArray("array after trim ",array);
    }
    
    //TODO: This method throws an exception please fix it.
    public static int [] trim(int[] arrayToAddTo){

        int initialSize = arrayToAddTo.length;

        //If we reach this block it means there was a 0 slot available
        //This means the array is due for trimming. i.e. deleting on the slots with zero
        int newSizeLess = 0;

        //write a for loop that counts all the zeros and adds 1 to newSizeLess for each
        for(int i = 0; i < arrayToAddTo.length;i++){
            if(arrayToAddTo[i]== 0){
                newSizeLess++;
            }
        }

        //new array size , old array - amount of zeros
        int newSize = initialSize - newSizeLess;

        //Create an array that is equal to newSize
        int[]newArray=new int[newSize];

        int newIndex = 0;

        for (int j = 0; j < initialSize; j++) {
            //not equal to 0
            if (arrayToAddTo[j] != 0) {
                newArray[newIndex] = arrayToAddTo[j];
                newIndex++;
            }
        }

        //This should return the new array
        return newArray;
    
    }

    //Method to pretty print array array 
    public static void printArray(String prefix,int[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]);
            if(i != arrayToPrint.length-1){
                System.out.print(",");
            } 
        }
        System.out.print("]\n");
    }
}




//int i = 0;
  //      while( i < arrayToAddTo.length){
//
  //          if(arrayToAddTo[i]== 0){
    //            newSizeLess++;
      //      }i++;
        //}


//write a for loop that counts all the zeros and adds 1 to newSizeLess for each
      //  for(int arr:arrayToAddTo){
        //    if(arr== 0){
          //      newSizeLess++;
            //}
        //}