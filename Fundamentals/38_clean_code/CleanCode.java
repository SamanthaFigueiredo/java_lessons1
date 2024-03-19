public class CleanCode {

    public static void main(String[] args) {

        int[] shoeSizes = {11, 2, 33, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8, 20, 1, 3, 5, 10, 99, 17, 2, 3, 21, 5, 6, 7, 8, 9, 50, 13, 2, 4, 32, 7, 8, 4, 2, 6, 8, 2, 5, 43, 9, 3, 5, 88, 54, 4, 10};

        System.out.println("Shoe Sizes \n");
        for (int num : shoeSizes) {
            System.out.print(num + " ");
        }

        System.out.println("\n------------------------------------------------------------------------------------------------------\n");
        System.out.println("Even Shirt Sizes\n");
        for (int num : shoeSizes) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("\n------------------------------------------------------------------------------------------------------\n");
        System.out.println("Sock Sizes (Divisible by 11)\n");
         for (int num : shoeSizes) {
            if (num % 11 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("\n------------------------------------------------------------------------------------------------------\n");
        System.out.println("Shoe Sizes + 1\n");
        for (int num : shoeSizes) {
            System.out.print(num + 1 + " ");
        }

        System.out.println("\n------------------------------------------------------------------------------------------------------\n");
        System.out.println("Even Shoe Sizes (from Shoe Sizes + 1)\n");
        for (int num : shoeSizes) {
            int val = num + 1;
            if (val % 2 == 0) {
                System.out.println(val);
            }
        }

        System.out.println("\n------------------------------------------------------------------------------------------------------\n");
        System.out.println("Us Sizes (Divisible by 11 from Shoe Sizes + 1)\n");
        for (int num : shoeSizes) {
            int val = num + 1;
            if (val % 11 == 0) {
                System.out.println(val);
            }
        }
    }

    

   

    

   

    

    
}
