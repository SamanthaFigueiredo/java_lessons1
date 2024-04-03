import java.util.Arrays;
public class ArrayManipulation1_9 {
    public static void main(String[]args){

        //initial arrays
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {3,14,12,6,14,7,19,11,0};

        //methods called to print initial arrays
        printArray("arrayA before subtracting ",arrayA);       
        printArray("arrayB before subtracting ",arrayB);

        //Called method assigned value that subtracts arrays
        arrayA = sub(arrayA, arrayB);
        
        //Called methods to show output arrays
        printArray("arrayA after subtracting ",arrayA);       
        printArray("arrayB after subtracting ",arrayB);
    }

    public static int [] sub(int[] arrayA,int[] arrayB){
        //Counts how many values in a and b are duplicate (equal to eachother)
        int initialSize=arrayA.length;
        int duplicates=0;
        for(int i=0;i<initialSize;i++){
            for(int j=0;j<arrayB.length;j++){
                if(arrayA[i]==arrayB[j]){
                    duplicates++; 

                }
            }
        }

        //arraysize without duplicates
        int newsizeA=initialSize-duplicates;

        //assigning new size to new array
        int[]newArray=new int[newsizeA];
            
        int index = 0;
        for (int i = 0; i < arrayA.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < arrayB.length; j++) {
                if (arrayA[i] == arrayB[j]) {
                    isDuplicate = true;
                    break;
                }
            }
                if (!isDuplicate) {
                newArray[index++] = arrayA[i];
                }
        }
        
        //return the new array
        return newArray;
    }
    //method that pretty prints the output array elements
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

//Searches for duplicate elements in singular array
//for(int i = 0; i < arrayA.length; i++) {  
  //          for(int j = i + 1; j < arrayA.length; j++) {  
    //            if(arr[i] == arr[j])  
      //              System.out.println(arr[j]);  
        //    }  
        //}  