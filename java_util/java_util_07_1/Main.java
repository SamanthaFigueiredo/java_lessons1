import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Money> moneyList = new ArrayList<>();
        moneyList.add(new Money(Currency.USD, 10));
        moneyList.add(new Money(Currency.USD, 5));
        moneyList.add(new Money(Currency.USD, 20));
        moneyList.add(new Money(Currency.EUR, 10));
        moneyList.add(new Money(Currency.EUR, 20));
        moneyList.add(new Money(Currency.ZAR, 10));
        moneyList.add(new Money(Currency.ZAR, 50));
        moneyList.add(new Money(Currency.ZAR, 5));
        moneyList.add(new Money(Currency.GBP, 10));
        moneyList.add(new Money(Currency.GBP, 30));

        // Sort using natural ordering (compareTo method)
        Collections.sort(moneyList);

        for (Money money : moneyList) {
            System.out.println(money);
        }
    }
}
