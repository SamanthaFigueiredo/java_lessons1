import java.util.Random;
import java.util.Arrays;

public class Excersice2{
	public static void main(String[]args){
		int [][]nums=new int[10][50];
	Random random = new Random();
	System.out.println("Before sorting:");
		 for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = random.nextInt(100); // Generates random numbers between 0 and 99
            	System.out.print(nums[i][j] + " ");
            }
        }

        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]);
        }

        // Print the sorted arrays
        System.out.println("\nAfter sorting:");
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }

		
		
	}
}