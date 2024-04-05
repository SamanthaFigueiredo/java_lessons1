import java.util.Random; //Random num import
import java.util.Arrays;
public class ArraySorting4{
	public static void main(String[]args){
		//initial array size 50
		int[]array={1,2,3,4,5,6,7,8,9,10,
					11,12,13,14,15,16,17,18,19,20,
					21,22,23,24,25,26,27,28,29,30,
					31,32,33,34,35,36,37,38,39,40,
					41,42,43,44,45,46,47,48,49,50};

		printarray("\nUnchanged array: ",array);

		//array[20]=60;
		//method called that adds a value to a certain index(element)
		array=add(array,60,20);   //(array name, element to add, index)
		array=add(array,61,61);
		printarray("Altered Array: ",array);

		//Method that sorts the array in descending
        insertionSort(array);
        //method called to print new array in descending
        printarray("Array in descending: ",array);
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
	

	//Method to add value to index position
	public static int[] add(int[]array,int itemToAdd,int index){

		int initialSize = array.length;
		int sizediff=(index+1) -initialSize;
        int newSize = initialSize+sizediff;

        //if value is less than size
		if(index<initialSize){
			for(int i=0;1<initialSize;i++){
				array[index]=itemToAdd;
				return array;
			}
		}

		//when value is larger than initial size
		int[]newArray=new int[newSize];

        //copy elements over
        for (int i = 0; i < initialSize; i++) {
            newArray[i] = array[i];
        }

        //add the element at the end of the array
        newArray[newSize-1]=itemToAdd;

        //This should return the new array
        return newArray;
	}

  
    //Method to sort it in descending
	public static void insertionSort(int[] arr) {
        //iterates through element
        for (int i = 1; i < arr.length; i++) {
            //assign elements to value
            int newElement = arr[i];
            int j;

            // Compare the new element to elements in the sorted section of the array
            // By moving backward from the current element's position, 
            // make space by shifting elements to left until  suitable position is located
            for (j = i; j > 0 && arr[j - 1] < newElement; j--) {
                arr[j] = arr[j - 1];
            }

            // Insert the newElement into its appropriate position
            arr[j] = newElement;
        }
    }
}

	

//Alternative

//int[] array = new int[50];

        //import for random values
  //      Random rand = new Random();

        //assigns 10 elements to array between 0-10
    //    for(int i=0;i<array.length;i++){
      //      array[i]=rand.nextInt(100);
        //}



 // Sorting the array in ascending order
   //     Arrays.sort(array);

        // Reversing the array
     //   reverse(array);  

//public static void reverse(int[] array)
  //  {
        // Length of the array
    //    int n = array.length;

        // Swapping the first half elements 
        // With last Half Elements
      //  for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
        //    int temp = array[i];

            // Assigning the first half
              // to the last half
          //  array[i] = array[n - i - 1];

            // Assigning the last half
            // to the first half
            //array[n - i - 1] = temp;
        //}
    //}  




     // Sorting the array in ascending order
     //   newsortasc(array);

        // Reversing the array
       // reverse(array);  

//public static void reverse(int[] array)
  //  {
        // Length of the array
//        int n = array.length;

        // Swapping the first half elements 
        // With last Half Elements
  //      for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
    //        int temp = array[i];

            // Assigning the first half
              // to the last half
      //      array[i] = array[n - i - 1];

            // Assigning the last half
            // to the first half
        //    array[n - i - 1] = temp;
        //}
    //} 

     //method that assigns and sorts new array (ascending)
    //public static void newsortasc(int[]dest_arr){
         
      //  int temp=0;
        //for (int i = 0; i < dest_arr.length; i++) {
          //  for (int j = i + 1; j < dest_arr.length; j++) {
            //    if (dest_arr[j] < dest_arr[i]) {
              //      temp = dest_arr[i];
                //    dest_arr[i] = dest_arr[j];
                  //  dest_arr[j] = temp;
                //}
            //}
        //}
    //}   

