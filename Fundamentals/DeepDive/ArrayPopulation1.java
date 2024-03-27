public class ArrayPopulation1 {
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

        //called method to print array
        printArray("Int array: ",intarr);

        //temp array being set to convert double to int
        int[]newdouble=new int[doublearr.length];
        for(int i=0;i<newdouble.length;i++)
            newdouble[i]=(int)(doublearr[i]);
            printArray("Double array: ",newdouble);

        //temp array being set to convert short to int
        int[]newshort=new int[shortarr.length];
        for(int i=0;i<newshort.length;i++)
            newshort[i]=(int)(shortarr[i]);
            printArray("Short array: ",newshort);

        //temp array being set to convert byte to int
        int[]newbyte=new int[bytearr.length];
        for(int i=0;i<newbyte.length;i++)
            newbyte[i]=(int)(bytearr[i]);
            printArray("Byte array: ",newbyte);

        //temp array being set to convert float to int
        int[]newfloat=new int[floatarr.length];
        for(int i=0;i<newfloat.length;i++)
            newfloat[i]=(int)(floatarr[i]);
            printArray("Float array: ",newfloat);

        //temp array being set to convert char to int
        int[]newchar=new int[chararr.length];
        for(int i=0;i<newchar.length;i++)
            newchar[i]=(int)(chararr[i]);
            printArray("Char array: ",newchar);

        //temp array being set to convert boolean to int
        int[]newboolean=new int[booleanarr.length];
        for(int i=0;i<newboolean.length;i++)
            if (booleanarr[i]) {
                newboolean[i] = 1;
            } else {
                newboolean[i] = 0;
            }
            printArray("Boolean array: ",newboolean);

        //temp array being set to convert String to int
        int[]newstring=new int[Stringarr.length];
        for(int i=0;i<newstring.length;i++)
            newstring[i] = Stringarr[i] != null ? 1 : 0;
            //newstring[i]=Integer.parseInt(Stringarr[i]);
            printArray("String array: ",newstring);

       

    }
    
    //print array method called that has both the String prefix and array placeholder
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
    //Alternative code
        //int[]newboolean=new int[booleanarr.length];
        //for(int i=0;i<newboolean.length;i++)
          //  i = (i << 1) + (booleanarr[i] ? 1 : 0);
            //newboolean[i]=(int)(booleanarr[i]);
            //printArray("Boolean array: ",newboolean);



    //public static void printArray(String prefix,String[] arrayToPrint){
      //  System.out.print(prefix);
        //System.out.print("[");
    
        //for (int i =0;i < arrayToPrint.length;i++) {
            
          //  System.out.print(arrayToPrint[i]);
            //if(i != arrayToPrint.length-1){
              //  System.out.print(",");
            //}    
        //}
        //System.out.print("]\n");
    //}
    //etc... for every other array
