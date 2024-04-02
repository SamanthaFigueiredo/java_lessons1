public class ArrayPopulation5{
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

        //populates arrays with index values, and zero padding 
        populateArray(intarr);
        populateArray(bytearr);
        populateArray(shortarr);
        populateArray(longarr);
        populateArray(doublearr);
        populateArray(floatarr);
        populateArray(chararr);
        populateArray(Stringarr);
        populateArray(booleanarr);

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

    public static void populateArray(int[]intarr){

        for (int i = 0; i < intarr.length; i++) {
            for(int j=0;j<5;j++){   //zero padding to array first 5 elements
                intarr[j]=0;
            }

            intarr[i] = -1; // Assigning the number -1 to each element
           
        }
    }

    public static void populateArray(byte[]bytearr){
        for (byte i = 0; i < bytearr.length; i++) {
            for(byte j=0;j<5;j++){  //zero padding to array first 5 elements
                bytearr[j]=0;
            }

            bytearr[i] = -1; // Assigning the number -1 to each element
        }
    }

    public static void populateArray(short[]shortarr){
       for(short i=0;i<shortarr.length;i++){
            for(short j=0;j<5;j++){ //zero padding to array first 5 elements
                shortarr[j]=0;
            }

            shortarr[i]= -1; // Assigning the number -1 to each element
        } 
    }

    public static void populateArray(long[]longarr){
        for(int i=0;i<longarr.length;i++){
            for(int j=0;j<5;j++){   //zero padding to array first 5 elements
                longarr[j]=0;
            }

            longarr[i]= -1; // Assigning the number -1 to each element
        }
    }

    public static void populateArray(double[]doublearr){
        for(int i=0;i<doublearr.length;i++){
            for(int j=0;j<5;j++){   //zero padding to array first 5 elements
                doublearr[j]=0;
            }

            doublearr[i]= -1; // Assigning the number -1 to each element
        }    
    }

    public static void populateArray(float[]floatarr){
        for(int i=0;i<floatarr.length;i++){
            for(int j=0;j<5;j++){ //zero padding to array first 5 elements
                floatarr[j]=0;
            }

            floatarr[i]= -1; // Assigning the number -1 to each element
        } 
    }

    public static void populateArray(char[]chararr){
        for(char i=0;i<chararr.length;i++){
            for(char j=0;j<5;j++){  //zero padding to array first 5 elements
                chararr[j]=(char)'0';
            }
            chararr[i]=(char)'a'; // Assigning the value a to each element
        }
    }

    public static void populateArray(String[]Stringarr){
        for(int i=0;i<Stringarr.length;i++){
            for(int j=0;j<5;j++){   //zero padding to array first 5 elements
                Stringarr[j]="0";
            }

            Stringarr[i]=null; // Assigning an empty string to each element
        }
    }

    public static void populateArray(boolean[]booleanarr){
        for (int i = 0; i < booleanarr.length; i++) {
            for(int j=0;j<5;j++){   //zero padding to array first 5 elements
                booleanarr[j]=false;
            }

            booleanarr[i] = true; // Assigning the value true to each element
        }
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