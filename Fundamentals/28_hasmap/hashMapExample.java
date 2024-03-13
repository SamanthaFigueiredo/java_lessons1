import java.util.HashMap;
import java.util.Map;
public class hashMapExample{
  private HashMap<String, String> hashMap;


  public hashMapExample() {
        this.hashMap = new HashMap<>();
    }
	public static void main(String[]args ){

		hashMapExample tester = new hashMapExample();

        // Adding some elements to the HashMap
        tester.hashMap.put("1", "One");
        tester.hashMap.put("2", "Two");
        tester.hashMap.put("3", "Three");

        tester.testEntrySet();
       
        tester.testReplace("2", "New Two");

        tester.testSize();

        tester.testValues();

        tester.testRemove("1");

        tester.testIsEmpty();

        tester.testKeySet();
        tester.testClear();
	}
	
	public void testEntrySet() {
        System.out.println("Entries in the HashMap:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

     public void testClear() {
        hashMap.clear();
        System.out.println("HashMap cleared.");
    }
      public void testReplace(String key, String newValue) {
        String replacedValue = hashMap.replace(key, newValue);
        System.out.println("Value replaced for key '" + key + "'. Previous value: " + replacedValue);
    }

    // Method to demonstrate size()
    public void testSize() {
        int size = hashMap.size();
        System.out.println("Size of the HashMap: " + size);
    }

    // Method to demonstrate values()
    public void testValues() {
        System.out.println("Values in the HashMap:");
        for (String value : hashMap.values()) {
            System.out.println(value);
        }
    }
     public void testIsEmpty() {
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("Is HashMap empty? " + isEmpty);
    }

    // Method to demonstrate keySet()
    public void testKeySet() {
        System.out.println("Keys in the HashMap:");
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
    }

    // Method to demonstrate remove()
    public void testRemove(String key) {
        String removedValue = hashMap.remove(key);
        System.out.println("Removed value for key '" + key + "': " + removedValue);
    }


}