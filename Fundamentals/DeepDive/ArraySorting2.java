import java.util.Random; //Random num import
public class ArraySorting2{
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

		//called method to sort array (descending)
        newsortdesc(array);

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

	

//Alternative

//int[] array = new int[50];

        //import for random values
  //      Random rand = new Random();

        //assigns 10 elements to array between 0-10
    //    for(int i=0;i<array.length;i++){
      //      array[i]=rand.nextInt(100);
        //}



