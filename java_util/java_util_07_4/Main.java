public class Main{
	public static void main(String[]args){
		Money money1=new Money(Currency.ZAR,10);
		Money money2=new Money(Currency.ZAR,10);
		Money money3=new Money(Currency.ZAR,10);
		
		System.out.println(money2.equals(money1)); // Should print true
        System.out.println(money2.equals(money3)); // Should print true
        System.out.println(money2.equals(null)); // Should print false
        System.out.println(money2.equals("string"));
        System.out.println(money1.hashCode()==money2.hashCode());
	}
}