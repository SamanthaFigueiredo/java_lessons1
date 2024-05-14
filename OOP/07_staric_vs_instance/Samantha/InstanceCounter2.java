public class InstanceCounter2 {
	
	public static int staticCounter;
    public static  int objectCounter;
	
             public static void InstanceCounter(){
		staticCounter++;
		System.out.println("new object created:"+staticCounter);             
             }

	public static void incrementStaticCounter(){
		staticCounter++;
		System.out.println("Number of instances in static:"+staticCounter);
	}

	public void incrementObjectCounter(){
                         objectCounter++;
		System.out.println("Counter in instance:"+objectCounter);
	}

}
