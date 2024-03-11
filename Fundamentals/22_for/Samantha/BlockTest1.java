public class BlockTest1 {
    public static void main(String[] args) {
       
        int sum = 0; // Variable to store the sum

        {
           int i = 1;
           System.out.println("Block 1 i = " + i);
           sum += i; // Add the value of i to the sum
        }
       
        {
            int i = 1;
            System.out.println("Block 2 i = " + i);
            sum += i; // Add the value of i to the sum
        }

        System.out.println("Sum of i values: " + sum); // Print the sum
    }
}
