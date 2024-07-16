import java.util.*;
public class ConCurrentLinkedQueue{
    public static void main(String[]args){
        ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();
 
        clq.add(12);
        clq.add(70);
        clq.add(1009);
        clq.add(475);
        clq.add(500);
        clq.add(200);
        clq.add(100);
        clq.add(90);
        clq.add(4);
        clq.add(10);
 
        
        System.out.println("ConcurrentLinkedQueue: "+ clq);
    }
}