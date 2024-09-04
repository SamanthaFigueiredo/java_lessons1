public class Main {
    public static void main(String[] args) {
        
        Finterface2 incrementor = (num1,num2) -> num1+num2;
        
        System.out.println( incrementor.add(5,5));
    }
}