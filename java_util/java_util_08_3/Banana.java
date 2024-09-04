public class Banana extends Money {
    private String name;

    public Banana(String name, Currency currency, double value) {
        super(currency, value);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Banana{name='" + name + "', currency=" + getCurrency() + ", value=" + getValue() + '}';
    }
}
