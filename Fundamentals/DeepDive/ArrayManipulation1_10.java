import java.util.Arrays;
public class ArrayManipulation1_10 {
    public static void main(String[]args){

        //initial arrays
        int[] arrayA = {3,4,2,6,4,7,9,1,0};
        int[] arrayB = {13,14,12,16,14,17,19,11,10};
       
        //methods called to print two arrays
        printArray("arrayA before merging ",arrayA);
        
        printArray("arrayB before merging ",arrayB);
        
        //assigning combined arrays to an array using method
        int []newArray=merge(arrayA,arrayB);

        //method called to print new array
        printArray("arrays after merging ",newArray);

        //called method to sort array (ascending)
        newsortasc(newArray);

        //method called to print new array in ascending
        printArray("arrays after merging ",newArray);

        //called method to sort array (descending)
        newsortdesc(newArray);

        //method called to print new array in descending
        printArray("arrays after merging ",newArray);

    }

    //method to combine 2 arrays into one array
    public static int [] merge(int[] arrayA,int[] arrayB){
        //values with combined array sizes
        int arrA=arrayA.length;
        int arrB=arrayB.length;
        int newSize=arrA+arrB;

        //new array with combined size of arrayA and arrayB
        int []newArray=new int[newSize]; 

        //copy both array into the new array continously.
        //Copies the two arrays into one array with correct arraysize
        System.arraycopy(arrayA, 0, newArray, 0, arrA);  
        System.arraycopy(arrayB, 0, newArray, arrA, arrB); 

        //Return the new array
        return newArray;
    }
    
    //method to pretty print arrays
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

     //method that assigns and sorts new array (ascending)
    public static void newsortasc(int[]dest_arr){
         
        int temp=0;
        for (int i = 0; i < dest_arr.length; i++) {
            for (int j = i + 1; j < dest_arr.length; j++) {
                if (dest_arr[j] < dest_arr[i]) {
                    temp = dest_arr[i];
                    dest_arr[i] = dest_arr[j];
                    dest_arr[j] = temp;
                }
            }
        }
    }

    //method that assigns and sorts new array (descending)
    public static void newsortdesc(int[]dest_arr){
         
        int temp=0;
        for (int i = 0; i < dest_arr.length; i++) {
            for (int j = i + 1; j < dest_arr.length; j++) {
                if (dest_arr[j] > dest_arr[i]) {
                    temp = dest_arr[i];
                    dest_arr[i] = dest_arr[j];
                    dest_arr[j] = temp;
                }
            }
        }
    }
}

//Alternatives

// arrayA=merge(arrayA,arrayB);
//printArray("array's after merging", arrayA)


 //       int arrA = arrayA.length;        //determines length of firstArray  
   //     int arrB = arrayB.length;  
     //   int[] newArray = new int[fal + sal];  //resultant array of size first array and second array  
    //System.arraycopy(arrayA, 0, newArray, 0, arrA);  
    //System.arraycopy(arrayB, 0, newArray, arrA, arrB);  
    //System.out.println(Arrays.toString(newArray));



    //int pos = 0;  
    //for (int element : arrayA) //copying elements of secondArray using for-each loop  
    //{  
    //newArray[pos] = element;  
    //pos++;              //increases position by 1  
    //}  
    //for (int element : arrayB) //copying elements of firstArray using for-each loop  
    //{  
    //newArray[pos] = element;  
    //pos++;  
    //}  
  