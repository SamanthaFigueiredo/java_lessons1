public class ArrayPopulation6 {
    public static void main(String[]args){
        
        //arrays using all primitive data types
        int[] intarr = new int[10];
        int[]destint=new int[10];
        byte[]bytearr=new byte[10];
        byte[]destbyte=new byte[10];
        short[]shortarr=new short[10];
        short[]destshort=new short[10];
        long[]longarr=new long[10];
        long[]destlong=new long[10];
        double[] doublearr=new double [10];
        double[]destdouble=new double[10];
        float[]floatarr=new float[10];
        
        float[]destfloat=new float[10];
        char[]chararr=new char[10];
        char[]destchar=new char[10];
        String[]Stringarr=new String[10];
        String[]destString=new String[10];
        boolean[]booleanarr=new boolean[10];
        boolean[]destbool=new boolean[10];

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

        //Called methods to print initial elements, copy them to another array, then print new array
        printArray("int array: ",intarr);
        copyarray(intarr,destint);
        printArray("  new int array: ",destint);

        printArray("byte array: ",bytearr);
        copyarray(bytearr,destbyte);
        printArray("  new byte array: ",destbyte);

        printArray("short array: ",shortarr);
        copyarray(shortarr,destshort);
        printArray("  new short array: ",destshort);

        printArray("long array: ",longarr);
        copyarray(longarr,destlong);
        printArray("  new long array: ",destlong);

        printArray("double array: ",doublearr);
        copyarray(doublearr,destdouble);
        printArray("  new double array: ",destdouble);

        printArray("float array: ",floatarr);
        copyarray(floatarr,destfloat);
        printArray("  new float array: ",destfloat);

        printArray("char array: ",chararr);
        copyarray(chararr,destchar);
        printArray("  new char array: ",destchar);

        printArray("string array: ",Stringarr);
        copyarray(Stringarr,destString);
        printArray("  new String array: ",destString);

        printArray("boolean array: ",booleanarr);
        copyarray(booleanarr,destbool);
        printArray("  new boolean array: ",destbool);





    }
    //method to copy 3 ints to new array
    public static void copyarray(int[]source, int[]dest){
        for(int i=0;i<dest.length-7;i++){
            dest[i]=source[i];
        }
    }
    //method to copy 3 byte to new array
    public static void copyarray(byte[]source, byte[]dest){
        for(byte i=0;i<dest.length-7;i++){
            dest[i]=source[i];
        }
    }
    //method to copy 3 short to new array
    public static void copyarray(short[]source, short[]dest){
        for(short i=0;i<dest.length-7;i++){
            dest[i]=source[i];
        }
    }
    //method to copy 3 long to new array
    public static void copyarray(long[]source, long[]dest){
        for(short i=0;i<dest.length-7;i++){
            dest[i]=source[i];
        }
    }
    //method to copy 3 double to new array
    public static void copyarray(double[]source, double[]dest){
        for(short i=0;i<dest.length-7;i++){
            dest[i]=source[i];
        }
    }
    //method to copy 3 float to new array
    public static void copyarray(float[]source, float[]dest){
        for(short i=0;i<dest.length-7;i++){
            dest[i]=source[i];
        }
    }
    //method to copy 3 String to new array
    public static void copyarray(String[]source, String[]dest){
        for(short i=0;i<dest.length-7;i++){
            dest[i]=source[i];
        }
    }
    //method to copy 3 char to new array
    public static void copyarray(char[]source, char[]dest){
        for(short i=0;i<dest.length-7;i++){
            dest[i]=source[i];
        }
    }
    //method to copy 3 boolean to new array
    public static void copyarray(boolean[]source, boolean[]dest){
        for(short i=0;i<dest.length-7;i++){
            dest[i]=source[i];
        }
    }

    public static void populateArray(int[]intarr){

        for (int i = 0; i < intarr.length; i++) {
            
            intarr[i] = -1; // Assigning the number -1 to each element
           
        }
    }

    public static void populateArray(byte[]bytearr){
        for (byte i = 0; i < bytearr.length; i++) {
           
            bytearr[i] = -1; // Assigning the number -1 to each element
        }
    }

    public static void populateArray(short[]shortarr){
       for(short i=0;i<shortarr.length;i++){
           
            shortarr[i]= -1; // Assigning the number -1 to each element
        } 
    }

    public static void populateArray(long[]longarr){
        for(int i=0;i<longarr.length;i++){
           
            longarr[i]= -1; // Assigning the number -1 to each element
        }
    }

    public static void populateArray(double[]doublearr){
        for(int i=0;i<doublearr.length;i++){

            doublearr[i]= -1; // Assigning the number -1 to each element
        }    
    }

    public static void populateArray(float[]floatarr){
        for(int i=0;i<floatarr.length;i++){
            
            floatarr[i]= -1; // Assigning the number -1 to each element
        } 
    }

    public static void populateArray(char[]chararr){
        for(char i=0;i<chararr.length;i++){
            
            chararr[i]=(char)'a'; // Assigning the value a to each element
        }
    }

    public static void populateArray(String[]Stringarr){
        for(int i=0;i<Stringarr.length;i++){
            
            Stringarr[i]="1"; // Assigning an empty string to each element
        }
    }

    public static void populateArray(boolean[]booleanarr){
        for (int i = 0; i < booleanarr.length; i++) {
            
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


//copy whole array
 //for(int i=0;i<destination.length-7;i++){
   //         destination[i]=source[i];

     //   }


//Alternative 

        //int[] intarr = new int[10];
        //int[]destint=new int[3];
//for(int i=0;i<dest.length;i++){
  //          dest[i]=source[i];
    //    }