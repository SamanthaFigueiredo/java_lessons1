public class NestedDoWhile {
    public static void main(String[] args) {  
        int i = 0;
        do{
            System.out.println("Outer = "+i);
            i++;
            int j = 0;
            do{
                System.out.println(" Inner = "+j);
                j++;
            } while(j<5);          
        }while(i<5);
    }
}
