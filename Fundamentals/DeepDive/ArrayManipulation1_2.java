public class ArrayManipulation1_2 {
    public static void main(String[]args){

        //initial unsorted array
        int[] array = {3,4,2,6,4,7,9,1};

        //method to pretty print array
        printArray("array before swapping ",array);
        
        //temp array being made to store array elements
        int[] dest_array = new int[array.length]; 
        //temp value that stores size 
        int temp = array.length; 

        for (int i = 0; i < array.length; i++) { 
           dest_array[temp - 1] = array[i]; //Since temp starts with length of array and decreases by 1 in each iteration. Reverse order
           temp = temp - 1; //decrements the temp variable
        } 

        //new array being printed
        printArray("array after swapping ",dest_array);

    }
    
    //method that pretty prints output
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


//for(int i=array.length-1;i>=0;i--){
  //          
    //     System.out.print(array[i] + "  ");
      //  }

 //for(int i=0;i<array.length/2;i++){
   //         int temp=array[i];
     //       array[i]=array[array.length-i-1];
       //     array[array.length-i-1]=temp;
        //}

//printArray("array before swapping ",array);
  //             
    //    int[] dest_array = new int[array.length]; 
      //  int temp = array.length; 
        //for (int i = 0; i < array.length; i++) { 
          //  dest_array[temp - 1] = array[i]; 
            //temp = temp - 1; 
        //} 


        //printArray("array after swapping ",dest_array);

           
      // int []temp=new int[array.length];
       //int j=0;
        //for(int i=array.length-1;i>=0;i--){
          //  
            //temp[j++]=array[i];
        //}

        //printArray("array after swapping ",temp);