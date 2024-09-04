import java.util.*;
public class SafeImpl<T extends Money>{
	List<T> list=new ArrayList<T>();
	 int lockIn(T target) {
        list.add(target);
        return list.indexOf(target); // Returning the index where the item is added
    }

    
    T getFromSafe(int key) {
        if (key >= 0 && key < list.size()) {
            return list.get(key);
        }
        return null; //if out of bounds
    }

	
}