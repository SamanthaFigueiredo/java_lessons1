public class ArrayManipulation1_6 {
    public static void main(String[]args){

        //initial array
        int[] array = {3,4,2,6,4,7,9,1,0};

        //called method the rints initial array
        printArray("array before first add ",array);

        //Assigned method to array for value added       
        array = add(array,12);

        //called method to print new array with added value
        printArray("array after first add ",array);

        //Assigned value with new added value      
        array = add(array,13);
        array = add(array,13);
        array = add(array,13);
        array = add(array,13);
        array = add(array,13);
        array = add(array,13);
        array = add(array,13);
        array = add(array,13);
        array = add(array,13);
        array = add(array,13);
        array = add(array,13);

        //called method to print new array with added value
        printArray("array after second add ", array);
    }
    
    //Called method that adds values to end of array
    public static int [] add(int[] arrayToAddTo, int itemToAdd){

        int initialSize = arrayToAddTo.length;
        
        //If we find a slot with a zero we use it and return
        //If this is the case then we do not resize all is good.
        for(int i = 0; i < initialSize;i++){
            if(arrayToAddTo[i]== 0){
                arrayToAddTo[i] = itemToAdd;
                return arrayToAddTo;
            }
        }

        //If we reach this block it means there was no 0 (zero) slot available
        //This means the array is full and we need to extend it by 10        
        int nextPosition = initialSize;
        int newSize = arrayToAddTo.length+10;

        //Create an array that is equal to newSize
        int[]newArray=new int[newSize];

        //copy elements over
        for (int i = 0; i < initialSize; i++) {
            newArray[i] = arrayToAddTo[i];
        }

        //add the element at the end of the array 
        newArray[nextPosition]=itemToAdd;

        //Return new array
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
