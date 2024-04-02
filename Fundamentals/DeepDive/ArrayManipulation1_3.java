public class ArrayManipulation1_3 {
    public static void main(String[]args){

        //initial array
        int[] array = {3,4,2,6,4,7,9,1};
        
        //method called to print initial array
        printArray("array before swapping ",array);

        //defined new array
        int[] dest_arr = new int[array.length];
       
        //method to sort new array
        newsort(array,dest_arr);

        //print new array
        printArray("array after swapping ",dest_arr);

    }
    
    //pretyy print arrays
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
    public static void newsort(int[]array,int[]dest_arr){
         for (int i = 0; i < array.length; i++) {
            dest_arr[i] = array[i];
        }
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
}
