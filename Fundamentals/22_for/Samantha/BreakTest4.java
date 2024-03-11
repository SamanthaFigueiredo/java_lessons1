public class BreakTest4 {
    public static void main(String[] args) {
       int i=0;
        outer:do{
            System.out.println("outer:"+i);
            i++;
            int j=0;
            inner:do{
                
                System.out.println(" inner:"+j);
                j++;
                if(i == 2){
                 continue inner;
                }
                int k=0;
                innest:do{
                    k++;
                    if(j == 2){
                        continue innest;
                     }
                    System.out.println("  innest:"+k);
                    
                }  while(k<3);           
            } while(j<3);        
        } while(i<3);   
    }
}
