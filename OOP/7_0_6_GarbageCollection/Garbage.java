public class Garbage{
	public String name;

	public Garbage(String paramName){
		this.name=paramName;
	}

	public void finalize(){
		System.out.print("Finalizing just before garbage collection");
	}

}