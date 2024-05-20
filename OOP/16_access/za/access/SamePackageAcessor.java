package za.access;

import main.AccessMe;

public class SamePackageAcessor extends AccessMe {
    public String getProperty() {
        AccessMe instance = new AccessMe(); 
        return instance.getName(); 
    }
}
