public class BreakTest3 {
    public static void main(String[] args) {
       int i=0;
        do{
            i++; 
            if(i == 7){            
             continue;

            } 
          
            System.out.println("outer:"+i);


        } while(i<10);
    }           
}

