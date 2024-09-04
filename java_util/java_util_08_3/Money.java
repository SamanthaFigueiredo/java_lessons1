public class Money implements Comparable<Money> {
    private Currency currency;
    private double value;

    public Money(Currency currency, double value) {
        this.currency = currency;
        this.value = value;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public int compareTo(Money other) {
        return Double.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency=" + currency +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object param) {
        if (this == param) {
            return true;
        }
        if (param == null || getClass() != param.getClass()) {
            return false;
        }
        Money money = (Money) param;
        return Double.compare(money.value, value) == 0 && currency == money.currency;
    }
}
