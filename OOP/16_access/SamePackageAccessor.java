public class SamePackageAccessor{
	public String getProperty() {
        AccessMe instance = new AccessMe(); 
        return instance.getName(); 
    }
}