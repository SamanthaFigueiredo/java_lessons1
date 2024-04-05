public class Strings2{
	public static void main(String[]args){

		String line="1,4,3,2,3,7,5,6,9\n"+
					"8,6,3,7,3,7,5,6,9\n";

		//String array that stores the rows
		String[]parts=line.split("\n");
		//new int array to store values of String array, parts.length is row
		int[][]newarray=new int[parts.length][];


		for (int i = 0; i < parts.length; i++) {
			//splits each rows contents with commas
    		String[] nums = parts[i].split(",");

    		// Initialize the inner array for this row
    		newarray[i] = new int[nums.length];

    		// Convert and store each number as an integer
    		for (int j = 0; j < nums.length; j++) {
        		newarray[i][j] = Integer.parseInt(nums[j]);
   			}
		}

		//Called Methods
		printarray(newarray);

		newsortasc(newarray);

		System.out.println("\n Array in Ascending order :\n");
		printarray(newarray);

		newsortdesc(newarray);

		System.out.println("\n Array in Descending order :\n");
		printarray(newarray);

	}
	//prints array to user
	public static void printarray(int[][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	//method that assigns and sorts new array (ascending)
    public static void newsortasc(int[][]arr){
         
        int temp=0;
        //iterates through entire outer array
        for (int i = 0; i < arr.length; i++) {
        	//iterates through entire inner array
            for (int j = 0; j < arr[i].length - 1; j++) {
            	//iterates and compares values for less than
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] > arr[i][k + 1]) {
                        temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    public static void newsortdesc(int[][]arr){
         
        int temp=0;
        //iterates through entire outer array
        for (int i = 0; i < arr.length; i++) {
        	//iterates through entire inner array
            for (int j = 0; j < arr[i].length - 1; j++) {
            	//iterates and compares values for greater than
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] < arr[i][k + 1]) {
                        temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }
    }
}





/*public class Strings2{
	public static void main(String[]args){

		String line="1,4,3,2,3,7,5,6,9\n"+
					"8,6,3,7,3,7,5,6,9\n";

		//String array that stores the rows
		String[]parts=line.split("\n");
		

		// Initialize the two-dimensional array to store the parts
		String[][] newarray = new String[parts.length][];

		// Split each line by commas
		for (int i = 0; i < parts.length; i++) {
    		newarray[i] = parts[i].split(",");
		}


		//copy elements from initial parts array (converted to int) to newarray
		
		//prints initial int array
		printarray(newarray);

		newsortasc(newarray);

		System.out.println("\n Array in Ascending order :\n");
		printarray(newarray);

		newsortdesc(newarray);

		System.out.println("\n Array in Descending order :\n");
		printarray(newarray);

	}
	//prints array to user
	public static void printarray(String[][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
					System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	//method that assigns and sorts new array (ascending)
    public static void newsortasc(String[][]arr){
         
        String temp;
        //iterates through entire outer array
        for (int i = 0; i < arr.length; i++) {
        	//iterates through entire inner array
            for (int j = 0; j < arr[i].length - 1; j++) {
            	//iterates and compares values for less than
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] .compareTo(arr[i][k + 1])>0) {
                        temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    public static void newsortdesc(String[][]arr){
         
        String temp;
        //iterates through entire outer array
        for (int i = 0; i < arr.length; i++) {
        	//iterates through entire inner array
            for (int j = 0; j < arr[i].length - 1; j++) {
            	//iterates and compares values for greater than
                for (int k = 0; k < arr[i].length - j - 1; k++) {
                    if (arr[i][k] .compareTo(arr[i][k + 1])<0) {
                        temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }
    }
}*/