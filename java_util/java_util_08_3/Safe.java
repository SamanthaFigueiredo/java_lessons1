public interface Safe<T extends Money>{
	int lockIn(Money target);

	Money getFromSafe(int key);
}