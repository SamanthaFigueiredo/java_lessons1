public class Main {
    public static void main(String[] args) {
        
        FInterface incrementor = (num) -> num + 1;
        
        System.out.println( incrementor.Increment(5));
    }
}