import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class HashMapTest3 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        
        hashMap.put("Portugal", "Lisbon");
        hashMap.put("Italy", "Rome");
        hashMap.put("France", "Paris");
        hashMap.put("Canada", "Vancouver");
        hashMap.put("Australia", "Sydney");
        hashMap.put("Japan", "Tokyo");
        
        
        Set<String> keySet = hashMap.keySet();        
        Collection<String> values = hashMap.values();    

        // Printing keys
         for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }   
}
