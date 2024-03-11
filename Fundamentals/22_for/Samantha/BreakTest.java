subl public class BreakTest {
    public static void main(String[] args) {
       
        int limit = 7;
        int i = 0; // Initialize the loop control variable outside the loop
       
        do {
            System.out.println("Counter = " + i);
            if (i == limit)
                break;
            i++; // Increment the loop control variable
        } while (i < 10); // Check the condition after executing the loop body
       
    }
}
