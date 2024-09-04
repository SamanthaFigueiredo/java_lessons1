import java.util.*;
public class Main{
	public static void main(String[]args){
		List<Money> money=new ArrayList<Money>();
		money.add(new Money(Currency.USD,10));
		money.add(new Money(Currency.USD,10));
		money.add(new Money(Currency.USD,10));
		money.add(new Money(Currency.USD,10));
		money.add(new Money(Currency.USD,10));
		money.add(new Money(Currency.GBP,5));
		money.add(new Money(Currency.GBP,5));
		money.add(new Money(Currency.GBP,5));
		money.add(new Money(Currency.GBP,5));
		money.add(new Money(Currency.GBP,5));
		money.add(new Money(Currency.GBP,5));
		money.add(new Money(Currency.GBP,5));
		money.add(new Money(Currency.ZAR,1));
		money.add(new Money(Currency.ZAR,1));
		money.add(new Money(Currency.ZAR,1));
		money.add(new Money(Currency.ZAR,1));
		money.add(new Money(Currency.ZAR,1));
		money.add(new Money(Currency.ZAR,1));


		 Collections.sort(money);

        for (Money moneyList : money) {
            System.out.println(moneyList);
        }


	}

	
}
