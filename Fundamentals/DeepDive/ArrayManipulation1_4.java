public class ArrayManipulation1_4 {
    public static void main(String[]args){
        //initial array
        int[] array = {3,4,2,6,4,7,9,1};
        
        //method called to print inital elements
        printArray("array before overwriting ",array);

        //values removed from indexes
        array[array.length - 1] = -1;
        array[array.length - 2] = -1;

        //method called to print new array with removed values
        printArray("array after overwriting ",array);

        //gets value of elements that are not equal to -1. (Removed)
        int countvals = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                countvals++;
            }
        }

        //New array to store values not equal to -1
        int[] newArray = new int[countvals];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                newArray[newIndex] = array[i];
                newIndex++;
            }
        }
        //method to print values left voer after removal
        printArray("New Array (Non-deleted values)",newArray);

    }

    //method that assigns and sorts new array (ascending)
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


//Alternative

// int[] newArray = getNonDeletedValues(array);

 //public static int[] getNonDeletedValues(int[] array) {
   //     int count = 0;
     //   for (int value : array) {
       //     if (value != -1) {
         //       count++;
           // }
        //}
        //int[] newArray = new int[count];
        //int newIndex = 0;
        //for (int value : array) {
          //  if (value != -1) {
            //    newArray[newIndex++] = value;
            //}
        //}
        //return newArray;
    //}

