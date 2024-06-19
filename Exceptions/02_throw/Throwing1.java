public class Throwing1 {
    public static void main(String[] args) {
        int i = 3;
        try {
            if(i > 2){
                throw new Exception("Housten we have a problem");
            }
            System.out.println("Did not throw");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
