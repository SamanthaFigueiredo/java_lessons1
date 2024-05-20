package main;

public class AccessMe{
	
	public static void main(String[]args){

		AccessMe instance = new AccessMe(); 
        instance.setName("John Doe"); 
        String name = instance.getName(); 
        System.out.println("Name: " + name); 

	}
	public String name=null;
	public void setName(String Name){
		this.name=Name;
	}

	public String getName(){
		return this.name;
	}
}