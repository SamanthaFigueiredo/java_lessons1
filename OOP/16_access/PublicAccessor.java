
import main.AccessMe;
public class PublicAccessor extends AccessMe{
	public String getProperty() {
        AccessMe instance = new AccessMe(); 
        return instance.getName(); 
    }
}