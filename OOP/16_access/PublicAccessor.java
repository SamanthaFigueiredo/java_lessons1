public class PublicAccessor{
	public String getProperty() {
        AccessMe instance = new AccessMe(); 
        return instance.getName(); 
    }
}