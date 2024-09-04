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
        if (this.value < other.value) {
            return 1;
        } else if (this.value > other.value) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Money{" +
                "currency=" + currency +
                ", value=" + value +
                '}';
    }
}
