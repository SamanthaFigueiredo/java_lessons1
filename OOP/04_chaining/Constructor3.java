public class Constructor3 {
    public Constructor3(){
   	 System.out.println("Running no-args constructor");
    }
    


    public Constructor3(String name, String surname){
   	 this();
   	 System.out.println("Running name arg constructor: Name ="+name);
     System.out.println("Running name arg constructor: surname ="+surname);
    }

    public Constructor3(String name, String surname, String job){
        this(name, surname);
        System.out.print(name+" "+surname+" is a "+job);
    }
}
