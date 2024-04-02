public class ArrayPopulation4{
	public static void main(String[]args){

		//arrays using all primitive data types
        int[] intarr = new int[10];
        byte[]bytearr=new byte[10];
        short[]shortarr=new short[10];
        long[]longarr=new long[10];
        double[] doublearr=new double [10];
        float[]floatarr=new float[10];
        char[]chararr=new char[10];
        String[]Stringarr=new String[10];
        boolean[]booleanarr=new boolean[10];

        int paddingnums=2;
        //Write a for loop that assigns the position as the value of the index.
       	for (int i = 0; i < intarr.length; i++) {
            intarr[i] = -1; // Assigning the number -1 to each element
        }
        for (byte i = 0; i < bytearr.length; i++) {
            bytearr[i] = -1; // Assigning the number -1 to each element
        }
        for(short i=0;i<shortarr.length;i++){
            shortarr[i]= -1; // Assigning the number -1 to each element
        }
        for(int i=0;i<longarr.length;i++){
            longarr[i]= -1; // Assigning the number -1 to each element
        }
        for(int i=0;i<doublearr.length;i++){
            doublearr[i]= -1; // Assigning the number -1 to each element
        }
        for(int i=0;i<floatarr.length;i++){
            floatarr[i]= -1; // Assigning the number -1 to each element
        }
        for(char i=0;i<chararr.length;i++){
            chararr[i]=(char)'a'; // Assigning the value a to each element
        }
        for(int i=0;i<Stringarr.length;i++){
            Stringarr[i]="-1"; // Assigning an empty string to each element
        }
        for (int i = 0; i < booleanarr.length; i++) {
            booleanarr[i] = true; // Assigning the value true to each element
        }
        //Called methods to print elements of each primitive array
        printArray("int array: ",intarr);
        printArray("byte array: ",bytearr);
        printArray("short array: ",shortarr);
        printArray("long array: ",longarr);
        printArray("double array: ",doublearr);
        printArray("float array: ",floatarr);
        printArray("char array: ",chararr);
        printArray("string array: ",Stringarr);
        printArray("boolean array: ",booleanarr);

	}

	 //method to iterate through int array and pretty print array
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

    //method to iterate through boolean array and pretty print array
    public static void printArray(String prefix,boolean[] arrayToPrint){
        System.out.print(prefix);
        System.out.print("[");
    
        for (int i =0;i < arrayToPrint.length;i++) {
            
            System.out.print(arrayToPrint[i]?"true":"false");
            if(i != arrayToPrint.length-1){
            	System.out.print(",");
            }        
        }
        System.out.print("]\n");
    }

    //method to iterate through byte array and pretty print array
    public static void printArray(String prefix,byte[] arrayToPrint){
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

    //method to iterate through short array and pretty print array
    public static void printArray(String prefix,short[] arrayToPrint){
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

    //method to iterate through char array and pretty print array
    public static void printArray(String prefix,char[] arrayToPrint){
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

    //method to iterate through long array and pretty print array
    public static void printArray(String prefix,long[] arrayToPrint){
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

    //method to iterate through double array and pretty print array
    public static void printArray(String prefix,double[] arrayToPrint){
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

    //method to iterate through float array and pretty print array
    public static void printArray(String prefix,float[] arrayToPrint){
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

    //method to iterate through String array and pretty print array
    public static void printArray(String prefix,String[] arrayToPrint){
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