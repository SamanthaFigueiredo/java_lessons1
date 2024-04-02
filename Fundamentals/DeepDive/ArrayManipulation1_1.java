import java.util.Random; //Random num import
import java.util.Arrays; //Array import for clearing

public class ArrayManipulation1_1 {
    public static void main(String[]args){
        //initial array
        int[] array = new int[10];

        //import for random values
        Random rand = new Random();

        //assigns 10 elements to array between 0-10
        for(int i=0;i<array.length;i++){
            array[i]=rand.nextInt(10);
        }
        
        //method to pretty print array
        printArray("array with random numbers ",array);

        //clears array by assigning elements as 0
        for(int i=0;i<array.length;i++){
            array[i]=0;
        }

        //Alternative
        //Arrays.fill(array,0);

        printArray("array with zeros ",array);

    }
    
    //method to pretty print array
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
