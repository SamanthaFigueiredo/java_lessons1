public class GenericMain {
    public static void main(String[] args) {
        // Create 5 instances of Banana with names, currency, and value
        Banana b1 = new Banana("Banana 1", Currency.USD, 1.0);
        Banana b2 = new Banana("Banana 2", Currency.ZAR, 1.5);
        Banana b3 = new Banana("Banana 3", Currency.GBP, 2.0);
        Banana b4 = new Banana("Banana 4", Currency.USD, 2.5);
        Banana b5 = new Banana("Banana 5", Currency.ZAR, 3.0);

        // Generic instance of SafeImpl with Banana as the generic type
        SafeImpl<Banana> safe = new SafeImpl<>();

        // Add all 5 instances to the safe with the lockIn method
        safe.lockIn(b1);
        safe.lockIn(b2);
        safe.lockIn(b3);
        safe.lockIn(b4);
        safe.lockIn(b5);

        // Print the contents of the safe
        System.out.println(safe);
    }
}
